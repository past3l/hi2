package com.facebook.react.views.common;

/* loaded from: classes.dex */
public class ContextUtils {
    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T findContextOfType(android.content.Context r2, java.lang.Class<? extends T> r3) {
        /*
        L0:
            boolean r0 = r3.isInstance(r2)
            if (r0 != 0) goto L18
            boolean r0 = r2 instanceof android.content.ContextWrapper
            r1 = 0
            if (r0 == 0) goto L17
            r0 = r2
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r2 != r0) goto L15
            return r1
        L15:
            r2 = r0
            goto L0
        L17:
            return r1
        L18:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.common.ContextUtils.findContextOfType(android.content.Context, java.lang.Class):java.lang.Object");
    }
}
