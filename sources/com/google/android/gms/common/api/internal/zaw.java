package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;

/* loaded from: classes.dex */
public final class zaw<O extends Api.ApiOptions> extends GoogleApi<O> {
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zad, SignInOptions> zace;
    private final Api.Client zaer;
    private final zaq zaes;
    private final ClientSettings zaet;

    public zaw(Context context, Api<O> api, Looper looper, Api.Client client, zaq zaqVar, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zad, SignInOptions> abstractClientBuilder) {
        super(context, api, looper);
        this.zaer = client;
        this.zaes = zaqVar;
        this.zaet = clientSettings;
        this.zace = abstractClientBuilder;
        this.zabm.zaa(this);
    }

    public final Api.Client zaab() {
        return this.zaer;
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final Api.Client zaa(Looper looper, GoogleApiManager.zaa<O> zaaVar) {
        this.zaes.zaa(zaaVar);
        return this.zaer;
    }

    @Override // com.google.android.gms.common.api.GoogleApi
    public final zace zaa(Context context, Handler handler) {
        return new zace(context, handler, this.zaet, this.zace);
    }
}
