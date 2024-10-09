package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class DataBufferSafeParcelable<T extends SafeParcelable> extends AbstractDataBuffer<T> {
    private static final String[] zalo = {UriUtil.DATA_SCHEME};
    private final Parcelable.Creator<T> zalp;

    public DataBufferSafeParcelable(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.zalp = creator;
    }

    public static DataHolder.Builder buildDataHolder() {
        return DataHolder.builder(zalo);
    }

    public static <T extends SafeParcelable> void addValue(DataHolder.Builder builder, T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(UriUtil.DATA_SCHEME, obtain.marshall());
        builder.withRow(contentValues);
        obtain.recycle();
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public T get(int i) {
        byte[] byteArray = this.mDataHolder.getByteArray(UriUtil.DATA_SCHEME, i, this.mDataHolder.getWindowIndex(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.zalp.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
