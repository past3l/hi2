package com.facebook.react.modules.network;

import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public interface CustomClientBuilder {
    void apply(OkHttpClient.Builder builder);
}
