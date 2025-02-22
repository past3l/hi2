package com.facebook.react.internal.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TurboModuleManagerDelegate {
    private final HybridData mHybridData;

    public NativeModule getLegacyModule(String str) {
        return null;
    }

    public abstract TurboModule getModule(String str);

    protected abstract HybridData initHybrid();

    public boolean unstable_enableSyncVoidMethods() {
        return false;
    }

    public boolean unstable_isLegacyModuleRegistered(String str) {
        return false;
    }

    public abstract boolean unstable_isModuleRegistered(String str);

    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return false;
    }

    public boolean unstable_shouldRouteTurboModulesThroughLegacyModuleInterop() {
        return false;
    }

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TurboModuleManagerDelegate() {
        maybeLoadOtherSoLibraries();
        this.mHybridData = initHybrid();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TurboModuleManagerDelegate(HybridData hybridData) {
        maybeLoadOtherSoLibraries();
        this.mHybridData = hybridData;
    }

    public List<String> getEagerInitModuleNames() {
        return new ArrayList();
    }

    protected synchronized void maybeLoadOtherSoLibraries() {
    }
}
