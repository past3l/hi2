package androidx.autofill.inline.common;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class BundledStyle {
    protected final Bundle mBundle;

    public final Bundle getBundle() {
        return this.mBundle;
    }

    protected abstract String getStyleKey();

    /* JADX INFO: Access modifiers changed from: protected */
    public BundledStyle(Bundle bundle) {
        this.mBundle = bundle;
    }

    public boolean isValid() {
        Bundle bundle = this.mBundle;
        return bundle != null && bundle.getBoolean(getStyleKey(), false);
    }

    public void assertIsValid() {
        if (isValid()) {
            return;
        }
        throw new IllegalStateException("Invalid style, missing bundle key " + getStyleKey());
    }

    /* loaded from: classes.dex */
    public static abstract class Builder<T extends BundledStyle> {
        protected final Bundle mBundle;

        public abstract T build();

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder(String str) {
            Bundle bundle = new Bundle();
            this.mBundle = bundle;
            bundle.putBoolean(str, true);
        }
    }
}
