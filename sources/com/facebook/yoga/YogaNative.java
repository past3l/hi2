package com.facebook.yoga;

import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public class YogaNative {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigFreeJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGConfigGetErrataJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGConfigNewJNI();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetErrataJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetLoggerJNI(long j, YogaLogger yogaLogger);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetPointScaleFactorJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGConfigSetUseWebDefaultsJNI(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeCalculateLayoutJNI(long j, float f, float f2, long[] jArr, YogaNodeJNIBase[] yogaNodeJNIBaseArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeCloneJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeCopyStyleJNI(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeFinalizeJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeInsertChildJNI(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean jni_YGNodeIsDirtyJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean jni_YGNodeIsReferenceBaselineJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeMarkDirtyJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeNewJNI();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeNewWithConfigJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeRemoveAllChildrenJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeRemoveChildJNI(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeResetJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSetAlwaysFormsContainingBlockJNI(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSetHasBaselineFuncJNI(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSetHasMeasureFuncJNI(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSetIsReferenceBaselineJNI(long j, boolean z);

    static native void jni_YGNodeSetStyleInputsJNI(long j, float[] fArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetAlignContentJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetAlignItemsJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetAlignSelfJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetAspectRatioJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetBorderJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetDirectionJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetDisplayJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetFlexBasisJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetFlexDirectionJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetFlexGrowJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetFlexJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetFlexShrinkJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetFlexWrapJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native float jni_YGNodeStyleGetGapJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetHeightJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetJustifyContentJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMarginJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMaxHeightJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMaxWidthJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMinHeightJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetMinWidthJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetOverflowJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetPaddingJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetPositionJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native int jni_YGNodeStyleGetPositionTypeJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long jni_YGNodeStyleGetWidthJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetAlignContentJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetAlignItemsJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetAlignSelfJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetAspectRatioJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetBorderJNI(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetDirectionJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetDisplayJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexBasisAutoJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexBasisJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexBasisPercentJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexDirectionJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexGrowJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexShrinkJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetFlexWrapJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetGapJNI(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetHeightAutoJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetHeightJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetHeightPercentJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetJustifyContentJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMarginAutoJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMarginJNI(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMarginPercentJNI(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMaxHeightJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMaxHeightPercentJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMaxWidthJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMaxWidthPercentJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMinHeightJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMinHeightPercentJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMinWidthJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetMinWidthPercentJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetOverflowJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPaddingJNI(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPaddingPercentJNI(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPositionJNI(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPositionPercentJNI(long j, int i, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetPositionTypeJNI(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetWidthAutoJNI(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetWidthJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeStyleSetWidthPercentJNI(long j, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void jni_YGNodeSwapChildJNI(long j, long j2, int i);

    static {
        SoLoader.loadLibrary("yoga");
    }
}
