package com.facebook.react.bridge;

/* loaded from: classes.dex */
public class JavaScriptContextHolder {
    private long mContext;

    public long get() {
        return this.mContext;
    }

    public JavaScriptContextHolder(long j) {
        this.mContext = j;
    }

    public synchronized void clear() {
        this.mContext = 0L;
    }
}
