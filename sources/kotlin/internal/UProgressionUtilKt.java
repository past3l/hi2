package kotlin.internal;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.UInt;
import kotlin.ULong;

/* compiled from: UProgressionUtil.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", ViewProps.START, ViewProps.END, "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1812differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int compare;
        int m = UByte$$ExternalSyntheticBackport0.m(i, i3);
        int m2 = UByte$$ExternalSyntheticBackport0.m(i2, i3);
        compare = Integer.compare(m ^ Integer.MIN_VALUE, m2 ^ Integer.MIN_VALUE);
        int m700constructorimpl = UInt.m700constructorimpl(m - m2);
        return compare >= 0 ? m700constructorimpl : UInt.m700constructorimpl(m700constructorimpl + i3);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1813differenceModulosambcqE(long j, long j2, long j3) {
        int compare;
        long m673m = UByte$$ExternalSyntheticBackport0.m673m(j, j3);
        long m673m2 = UByte$$ExternalSyntheticBackport0.m673m(j2, j3);
        compare = Long.compare(m673m ^ Long.MIN_VALUE, m673m2 ^ Long.MIN_VALUE);
        long m779constructorimpl = ULong.m779constructorimpl(m673m - m673m2);
        return compare >= 0 ? m779constructorimpl : ULong.m779constructorimpl(m779constructorimpl + j3);
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1815getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        int compare;
        int compare2;
        if (i3 > 0) {
            compare2 = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            return compare2 >= 0 ? i2 : UInt.m700constructorimpl(i2 - m1812differenceModuloWZ9TVnA(i2, i, UInt.m700constructorimpl(i3)));
        }
        if (i3 < 0) {
            compare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            return compare <= 0 ? i2 : UInt.m700constructorimpl(i2 + m1812differenceModuloWZ9TVnA(i, i2, UInt.m700constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1814getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        int compare;
        int compare2;
        if (j3 > 0) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            return compare2 >= 0 ? j2 : ULong.m779constructorimpl(j2 - m1813differenceModulosambcqE(j2, j, ULong.m779constructorimpl(j3)));
        }
        if (j3 < 0) {
            compare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            return compare <= 0 ? j2 : ULong.m779constructorimpl(j2 + m1813differenceModulosambcqE(j, j2, ULong.m779constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
