package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();
    private final String name;

    @Deprecated
    private final int zzk;
    private final long zzl;

    public Feature(String str, long j) {
        this.name = str;
        this.zzl = j;
        this.zzk = -1;
    }

    public String getName() {
        return this.name;
    }

    public long getVersion() {
        long j = this.zzl;
        return j == -1 ? this.zzk : j;
    }

    public Feature(String str, int i, long j) {
        this.name = str;
        this.zzk = i;
        this.zzl = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzk);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add(HintConstants.AUTOFILL_HINT_NAME, getName()).add("version", Long.valueOf(getVersion())).toString();
    }
}
