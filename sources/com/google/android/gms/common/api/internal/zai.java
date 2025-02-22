package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes.dex */
public final class zai<O extends Api.ApiOptions> {
    private final Api<O> mApi;
    private final O zabh;
    private final boolean zacu;
    private final int zacv;

    private zai(Api<O> api, O o) {
        this.zacu = false;
        this.mApi = api;
        this.zabh = o;
        this.zacv = Objects.hashCode(api, o);
    }

    public final int hashCode() {
        return this.zacv;
    }

    private zai(Api<O> api) {
        this.zacu = true;
        this.mApi = api;
        this.zabh = null;
        this.zacv = System.identityHashCode(this);
    }

    public static <O extends Api.ApiOptions> zai<O> zaa(Api<O> api, O o) {
        return new zai<>(api, o);
    }

    public static <O extends Api.ApiOptions> zai<O> zaa(Api<O> api) {
        return new zai<>(api);
    }

    public final String zan() {
        return this.mApi.getName();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zai)) {
            return false;
        }
        zai zaiVar = (zai) obj;
        return !this.zacu && !zaiVar.zacu && Objects.equal(this.mApi, zaiVar.mApi) && Objects.equal(this.zabh, zaiVar.zabh);
    }
}
