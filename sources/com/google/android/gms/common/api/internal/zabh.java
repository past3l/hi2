package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zabh {
    private static final ExecutorService zahw = com.google.android.gms.internal.base.zam.zacv().zaa(2, new NumberedThreadFactory("GAC_Executor"), 9);

    public static ExecutorService zabb() {
        return zahw;
    }
}
