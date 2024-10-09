package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaj> CREATOR = new zak();
    private final ConnectionResult zadi;
    private final int zalf;
    private final ResolveAccountResponse zase;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaj(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.zalf = i;
        this.zadi = connectionResult;
        this.zase = resolveAccountResponse;
    }

    public final ConnectionResult getConnectionResult() {
        return this.zadi;
    }

    public final ResolveAccountResponse zacx() {
        return this.zase;
    }

    public zaj(int i) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zalf);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zadi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zase, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
