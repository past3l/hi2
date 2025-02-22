package com.facebook.soloader;

import android.os.Trace;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
class Api18TraceUtils {
    private static final int MAX_SECTION_NAME_LENGTH = 127;

    Api18TraceUtils() {
    }

    public static void beginTraceSection(String str, @Nullable String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            str4 = str + str2.substring(0, (127 - str.length()) - str3.length()) + str3;
        }
        Trace.beginSection(str4);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
