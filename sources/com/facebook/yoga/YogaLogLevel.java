package com.facebook.yoga;

/* loaded from: classes.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int mIntValue;

    public int intValue() {
        return this.mIntValue;
    }

    YogaLogLevel(int i) {
        this.mIntValue = i;
    }

    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return WARN;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return VERBOSE;
        }
        if (i == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i);
    }
}
