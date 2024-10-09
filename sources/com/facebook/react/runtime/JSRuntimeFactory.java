package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public abstract class JSRuntimeFactory {
    private final HybridData mHybridData;

    static {
        SoLoader.loadLibrary("rninstance");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JSRuntimeFactory(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
