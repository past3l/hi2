package com.google.android.gms.iid;

import android.content.Intent;

/* loaded from: classes.dex */
final class zzf implements Runnable {
    private final /* synthetic */ Intent zzbf;
    private final /* synthetic */ Intent zzbg;
    private final /* synthetic */ zze zzbh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zze zzeVar, Intent intent, Intent intent2) {
        this.zzbh = zzeVar;
        this.zzbf = intent;
        this.zzbg = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbh.handleIntent(this.zzbf);
        this.zzbh.zzf(this.zzbg);
    }
}
