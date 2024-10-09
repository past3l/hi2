package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* loaded from: classes.dex */
final class zabl implements Runnable {
    private final /* synthetic */ GoogleApiManager.zaa zaiy;
    private final /* synthetic */ ConnectionResult zaiz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zabl(GoogleApiManager.zaa zaaVar, ConnectionResult connectionResult) {
        this.zaiy = zaaVar;
        this.zaiz = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaiy.onConnectionFailed(this.zaiz);
    }
}
