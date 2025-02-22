package com.facebook.cache.common;

import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class DebuggingCacheKey extends SimpleCacheKey {

    @Nullable
    private final Object mCallerContext;
    private final Uri mSourceUri;

    @Nullable
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public Uri getSourceUri() {
        return this.mSourceUri;
    }

    public DebuggingCacheKey(String str, @Nullable Object obj, Uri uri) {
        super(str);
        this.mCallerContext = obj;
        this.mSourceUri = uri;
    }
}
