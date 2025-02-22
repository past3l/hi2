package com.facebook.react;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.ReactConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReactPackageHelper {
    ReactPackageHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Iterable<ModuleHolder> getNativeModuleIterator(ReactPackage reactPackage, ReactApplicationContext reactApplicationContext) {
        FLog.d(ReactConstants.TAG, reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        final List<NativeModule> createNativeModules = reactPackage.createNativeModules(reactApplicationContext);
        return new Iterable() { // from class: com.facebook.react.ReactPackageHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return ReactPackageHelper.lambda$getNativeModuleIterator$0(createNativeModules);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Iterator lambda$getNativeModuleIterator$0(final List list) {
        return new Iterator<ModuleHolder>() { // from class: com.facebook.react.ReactPackageHelper.1
            int position = 0;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public ModuleHolder next() {
                List list2 = list;
                int i = this.position;
                this.position = i + 1;
                return new ModuleHolder((NativeModule) list2.get(i));
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.position < list.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove methods ");
            }
        };
    }
}
