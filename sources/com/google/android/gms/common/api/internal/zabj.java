package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;

/* loaded from: classes.dex */
final class zabj implements Runnable {
    private final /* synthetic */ GoogleApiManager.zaa zaiy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zabj(GoogleApiManager.zaa zaaVar) {
        this.zaiy = zaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaiy.zabg();
    }
}
