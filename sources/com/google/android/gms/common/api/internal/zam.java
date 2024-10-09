package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
final class zam {
    private final int zadh;
    private final ConnectionResult zadi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zam(ConnectionResult connectionResult, int i) {
        Preconditions.checkNotNull(connectionResult);
        this.zadi = connectionResult;
        this.zadh = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ConnectionResult getConnectionResult() {
        return this.zadi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zar() {
        return this.zadh;
    }
}
