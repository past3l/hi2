package com.facebook.soloader.recovery;

import com.facebook.soloader.BackupSoSource;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.SoLoaderDSONotFoundError;
import com.facebook.soloader.SoLoaderULError;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.UnpackingSoSource;

/* loaded from: classes.dex */
public class ReunpackNonBackupSoSources implements RecoveryStrategy {
    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        if (!(unsatisfiedLinkError instanceof SoLoaderULError) || (unsatisfiedLinkError instanceof SoLoaderDSONotFoundError)) {
            return false;
        }
        String soName = ((SoLoaderULError) unsatisfiedLinkError).getSoName();
        StringBuilder sb = new StringBuilder("Reunpacking NonApk UnpackingSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(soName == null ? "" : ", retrying for specific library " + soName);
        LogUtil.e(SoLoader.TAG, sb.toString());
        for (SoSource soSource : soSourceArr) {
            if (soSource instanceof UnpackingSoSource) {
                UnpackingSoSource unpackingSoSource = (UnpackingSoSource) soSource;
                if (unpackingSoSource instanceof BackupSoSource) {
                    continue;
                } else {
                    try {
                        LogUtil.e(SoLoader.TAG, "Runpacking " + unpackingSoSource.getName());
                        unpackingSoSource.prepareForceRefresh();
                    } catch (Exception e) {
                        LogUtil.e(SoLoader.TAG, "Encountered an exception while reunpacking " + unpackingSoSource.getName() + " for library " + soName + ": ", e);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
