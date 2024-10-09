package com.learnium.RNDeviceInfo;

import androidx.core.os.EnvironmentCompat;

/* loaded from: classes3.dex */
public enum DeviceType {
    HANDSET("Handset"),
    TABLET("Tablet"),
    TV("Tv"),
    UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);

    private final String value;

    public String getValue() {
        return this.value;
    }

    DeviceType(String str) {
        this.value = str;
    }
}
