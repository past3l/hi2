package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zag implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ GoogleApiClient.OnConnectionFailedListener zaok;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zag(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zaok = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zaok.onConnectionFailed(connectionResult);
    }
}
