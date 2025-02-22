package com.google.android.gms.internal.common;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class zzg {
    private static volatile boolean zziy = !zzam();

    public static boolean zzam() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static Context getDeviceProtectedStorageContext(Context context) {
        boolean isDeviceProtectedStorage;
        Context createDeviceProtectedStorageContext;
        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
        if (isDeviceProtectedStorage) {
            return context;
        }
        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        return createDeviceProtectedStorageContext;
    }
}
