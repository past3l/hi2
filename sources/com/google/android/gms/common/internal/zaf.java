package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zaf implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ GoogleApiClient.ConnectionCallbacks zaoj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zaoj = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.zaoj.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zaoj.onConnectionSuspended(i);
    }
}
