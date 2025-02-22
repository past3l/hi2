package com.facebook.yoga;

/* loaded from: classes.dex */
public enum YogaLayoutType {
    LAYOUT(0),
    MEASURE(1),
    CACHED_LAYOUT(2),
    CACHED_MEASURE(3);

    private final int mIntValue;

    public int intValue() {
        return this.mIntValue;
    }

    YogaLayoutType(int i) {
        this.mIntValue = i;
    }

    public static YogaLayoutType fromInt(int i) {
        if (i == 0) {
            return LAYOUT;
        }
        if (i == 1) {
            return MEASURE;
        }
        if (i == 2) {
            return CACHED_LAYOUT;
        }
        if (i == 3) {
            return CACHED_MEASURE;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
