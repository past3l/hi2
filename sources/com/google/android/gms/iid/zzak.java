package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzak {
    private SharedPreferences zzde;
    private final zzn zzdf;
    private final Map<String, zzo> zzdg;
    private Context zzl;

    public zzak(Context context) {
        this(context, new zzn());
    }

    private zzak(Context context, zzn zznVar) {
        this.zzdg = new ArrayMap();
        this.zzl = context;
        this.zzde = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.zzdf = zznVar;
        File file = new File(ContextCompat.getNoBackupFilesDir(this.zzl), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            InstanceIDListenerService.zzd(this.zzl, this);
        } catch (IOException e) {
            if (Log.isLoggable("InstanceID/Store", 3)) {
                String valueOf = String.valueOf(e.getMessage());
                Log.d("InstanceID/Store", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public final boolean isEmpty() {
        return this.zzde.getAll().isEmpty();
    }

    private static String zzd(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private static String zze(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T-timestamp|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized String get(String str) {
        return this.zzde.getString(str, null);
    }

    public final synchronized void zzi(String str) {
        SharedPreferences.Editor edit = this.zzde.edit();
        for (String str2 : this.zzde.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    public final synchronized void zzz() {
        this.zzdg.clear();
        zzn.zzi(this.zzl);
        this.zzde.edit().clear().commit();
    }

    public final synchronized String zzf(String str, String str2, String str3) {
        return this.zzde.getString(zzd(str, str2, str3), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long zzg(String str, String str2, String str3) {
        return this.zzde.getLong(zze(str, str2, str3), -1L);
    }

    public final synchronized void zzd(String str, String str2, String str3, String str4, String str5) {
        String zzd = zzd(str, str2, str3);
        String zze = zze(str, str2, str3);
        SharedPreferences.Editor edit = this.zzde.edit();
        edit.putString(zzd, str4);
        edit.putLong(zze, System.currentTimeMillis());
        edit.putString("appVersion", str5);
        edit.commit();
    }

    public final synchronized void zzh(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.zzde.edit();
        edit.remove(zzd(str, str2, str3));
        edit.remove(zze(str, str2, str3));
        edit.commit();
    }

    public final synchronized zzo zzj(String str) {
        zzo zzf;
        zzo zzoVar = this.zzdg.get(str);
        if (zzoVar != null) {
            return zzoVar;
        }
        try {
            zzf = this.zzdf.zze(this.zzl, str);
        } catch (zzp unused) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            InstanceIDListenerService.zzd(this.zzl, this);
            zzf = this.zzdf.zzf(this.zzl, str);
        }
        this.zzdg.put(str, zzf);
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk(String str) {
        synchronized (this) {
            this.zzdg.remove(str);
        }
        zzn.zzg(this.zzl, str);
        zzi(String.valueOf(str).concat("|"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }
}
