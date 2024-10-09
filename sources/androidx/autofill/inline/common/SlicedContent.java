package androidx.autofill.inline.common;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.net.Uri;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.autofill.inline.UiVersions;

/* loaded from: classes.dex */
public abstract class SlicedContent implements UiVersions.Content {
    static final Uri INLINE_SLICE_URI = Uri.parse("inline.slice");
    protected final Slice mSlice;

    public abstract PendingIntent getAttributionIntent();

    @Override // androidx.autofill.inline.UiVersions.Content
    public final Slice getSlice() {
        return this.mSlice;
    }

    public abstract boolean isValid();

    /* JADX INFO: Access modifiers changed from: protected */
    public SlicedContent(Slice slice) {
        this.mSlice = slice;
    }

    public static String getVersion(Slice slice) {
        SliceSpec spec;
        String type;
        spec = slice.getSpec();
        type = spec.getType();
        return type;
    }

    /* loaded from: classes.dex */
    public static abstract class Builder<T extends SlicedContent> {
        protected final Slice.Builder mSliceBuilder;

        public abstract T build();

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder(String str) {
            ComponentDialog$$ExternalSyntheticApiModelOutline0.m23m();
            this.mSliceBuilder = ComponentDialog$$ExternalSyntheticApiModelOutline0.m(SlicedContent.INLINE_SLICE_URI, ComponentDialog$$ExternalSyntheticApiModelOutline0.m(str, 1));
        }
    }
}
