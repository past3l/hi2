package com.facebook.react.bridge;

import com.facebook.infer.annotation.Assertions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class JSIModuleRegistry {
    private final Map<JSIModuleType, JSIModuleHolder> mModules = new HashMap();

    public JSIModule getModule(JSIModuleType jSIModuleType) {
        JSIModuleHolder jSIModuleHolder = this.mModules.get(jSIModuleType);
        if (jSIModuleHolder == null) {
            throw new IllegalArgumentException("Unable to find JSIModule for class " + jSIModuleType);
        }
        return (JSIModule) Assertions.assertNotNull(jSIModuleHolder.getJSIModule());
    }

    public <T extends JSIModule> void registerModules(List<JSIModuleSpec<T>> list) {
        for (JSIModuleSpec<T> jSIModuleSpec : list) {
            this.mModules.put(jSIModuleSpec.getJSIModuleType(), new JSIModuleHolder(jSIModuleSpec));
        }
    }

    public void notifyJSInstanceDestroy() {
        for (Map.Entry<JSIModuleType, JSIModuleHolder> entry : this.mModules.entrySet()) {
            if (entry.getKey() != JSIModuleType.TurboModuleManager) {
                entry.getValue().notifyJSInstanceDestroy();
            }
        }
    }
}
