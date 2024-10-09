package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class zai extends Drawable.ConstantState {
    int mChangingConfigurations;
    int zanw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zai(zai zaiVar) {
        if (zaiVar != null) {
            this.mChangingConfigurations = zaiVar.mChangingConfigurations;
            this.zanw = zaiVar.zanw;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.mChangingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zae(this);
    }
}
