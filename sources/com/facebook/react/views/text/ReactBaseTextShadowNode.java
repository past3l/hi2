package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ReactBaseTextShadowNode extends LayoutShadowNode implements BasicTextAttributeProvider {
    public static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String INLINE_VIEW_PLACEHOLDER = "0";
    public static final String PROP_SHADOW_COLOR = "textShadowColor";
    public static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    public static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    public static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    public static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    public static final String PROP_TEXT_TRANSFORM = "textTransform";
    protected ReactAccessibilityDelegate.AccessibilityRole mAccessibilityRole;
    protected boolean mAdjustsFontSizeToFit;
    protected int mBackgroundColor;
    protected int mColor;
    protected boolean mContainsImages;
    protected String mFontFamily;
    protected String mFontFeatureSettings;
    protected int mFontStyle;
    protected int mFontWeight;
    protected int mHyphenationFrequency;
    protected boolean mIncludeFontPadding;
    protected Map<Integer, ReactShadowNode> mInlineViews;
    protected boolean mIsBackgroundColorSet;
    protected boolean mIsColorSet;
    protected boolean mIsLineThroughTextDecorationSet;
    protected boolean mIsUnderlineTextDecorationSet;
    protected int mJustificationMode;
    protected float mMinimumFontScale;
    protected int mNumberOfLines;
    protected ReactTextViewManagerCallback mReactTextViewManagerCallback;
    protected ReactAccessibilityDelegate.Role mRole;
    protected int mTextAlign;
    protected TextAttributes mTextAttributes;
    protected int mTextBreakStrategy;
    protected int mTextShadowColor;
    protected float mTextShadowOffsetDx;
    protected float mTextShadowOffsetDy;
    protected float mTextShadowRadius;

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public ReactAccessibilityDelegate.AccessibilityRole getAccessibilityRole() {
        return this.mAccessibilityRole;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public int getColor() {
        return this.mColor;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public String getFontFamily() {
        return this.mFontFamily;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public String getFontFeatureSettings() {
        return this.mFontFeatureSettings;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public int getFontStyle() {
        return this.mFontStyle;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public int getFontWeight() {
        return this.mFontWeight;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public ReactAccessibilityDelegate.Role getRole() {
        return this.mRole;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public int getTextShadowColor() {
        return this.mTextShadowColor;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public float getTextShadowOffsetDx() {
        return this.mTextShadowOffsetDx;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public float getTextShadowOffsetDy() {
        return this.mTextShadowOffsetDy;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public float getTextShadowRadius() {
        return this.mTextShadowRadius;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public boolean isBackgroundColorSet() {
        return this.mIsBackgroundColorSet;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public boolean isColorSet() {
        return this.mIsColorSet;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public boolean isLineThroughTextDecorationSet() {
        return this.mIsLineThroughTextDecorationSet;
    }

    @Override // com.facebook.react.views.text.BasicTextAttributeProvider
    public boolean isUnderlineTextDecorationSet() {
        return this.mIsUnderlineTextDecorationSet;
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    private static void buildSpannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list, TextAttributes textAttributes, boolean z, Map<Integer, ReactShadowNode> map, int i) {
        if (ReactNativeFeatureFlags.enableSpannableBuildingUnification()) {
            buildSpannedFromShadowNodeUnified(reactBaseTextShadowNode, spannableStringBuilder, list, textAttributes, z, map, i);
        } else {
            buildSpannedFromShadowNodeDuplicated(reactBaseTextShadowNode, spannableStringBuilder, list, textAttributes, z, map, i);
        }
    }

    private static void buildSpannedFromShadowNodeDuplicated(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list, TextAttributes textAttributes, boolean z, Map<Integer, ReactShadowNode> map, int i) {
        TextAttributes textAttributes2;
        float layoutWidth;
        float layoutHeight;
        if (textAttributes != null) {
            textAttributes2 = textAttributes.applyChild(reactBaseTextShadowNode.mTextAttributes);
        } else {
            textAttributes2 = reactBaseTextShadowNode.mTextAttributes;
        }
        TextAttributes textAttributes3 = textAttributes2;
        int childCount = reactBaseTextShadowNode.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ReactShadowNodeImpl childAt = reactBaseTextShadowNode.getChildAt(i2);
            if (childAt instanceof ReactRawTextShadowNode) {
                spannableStringBuilder.append((CharSequence) TextTransform.apply(((ReactRawTextShadowNode) childAt).getText(), textAttributes3.getTextTransform()));
            } else if (childAt instanceof ReactBaseTextShadowNode) {
                buildSpannedFromShadowNodeDuplicated((ReactBaseTextShadowNode) childAt, spannableStringBuilder, list, textAttributes3, z, map, spannableStringBuilder.length());
            } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                spannableStringBuilder.append(INLINE_VIEW_PLACEHOLDER);
                list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((ReactTextInlineImageShadowNode) childAt).buildInlineImageSpan()));
            } else if (z) {
                int reactTag = childAt.getReactTag();
                YogaValue styleWidth = childAt.getStyleWidth();
                YogaValue styleHeight = childAt.getStyleHeight();
                if (styleWidth.unit != YogaUnit.POINT || styleHeight.unit != YogaUnit.POINT) {
                    childAt.calculateLayout();
                    layoutWidth = childAt.getLayoutWidth();
                    layoutHeight = childAt.getLayoutHeight();
                } else {
                    layoutWidth = styleWidth.value;
                    layoutHeight = styleHeight.value;
                }
                spannableStringBuilder.append(INLINE_VIEW_PLACEHOLDER);
                list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new TextInlineViewPlaceholderSpan(reactTag, (int) layoutWidth, (int) layoutHeight)));
                map.put(Integer.valueOf(reactTag), childAt);
                childAt.markUpdateSeen();
            } else {
                throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (reactBaseTextShadowNode.mIsColorSet) {
                list.add(new SetSpanOperation(i, length, new ReactForegroundColorSpan(reactBaseTextShadowNode.mColor)));
            }
            if (reactBaseTextShadowNode.mIsBackgroundColorSet) {
                list.add(new SetSpanOperation(i, length, new ReactBackgroundColorSpan(reactBaseTextShadowNode.mBackgroundColor)));
            }
            ReactAccessibilityDelegate.Role role = reactBaseTextShadowNode.mRole;
            if (role == null ? reactBaseTextShadowNode.mAccessibilityRole == ReactAccessibilityDelegate.AccessibilityRole.LINK : role == ReactAccessibilityDelegate.Role.LINK) {
                list.add(new SetSpanOperation(i, length, new ReactClickableSpan(reactBaseTextShadowNode.getReactTag())));
            }
            float effectiveLetterSpacing = textAttributes3.getEffectiveLetterSpacing();
            if (!Float.isNaN(effectiveLetterSpacing) && (textAttributes == null || textAttributes.getEffectiveLetterSpacing() != effectiveLetterSpacing)) {
                list.add(new SetSpanOperation(i, length, new CustomLetterSpacingSpan(effectiveLetterSpacing)));
            }
            int effectiveFontSize = textAttributes3.getEffectiveFontSize();
            if (textAttributes == null || textAttributes.getEffectiveFontSize() != effectiveFontSize) {
                list.add(new SetSpanOperation(i, length, new ReactAbsoluteSizeSpan(effectiveFontSize)));
            }
            if (reactBaseTextShadowNode.mFontStyle != -1 || reactBaseTextShadowNode.mFontWeight != -1 || reactBaseTextShadowNode.mFontFamily != null) {
                list.add(new SetSpanOperation(i, length, new CustomStyleSpan(reactBaseTextShadowNode.mFontStyle, reactBaseTextShadowNode.mFontWeight, reactBaseTextShadowNode.mFontFeatureSettings, reactBaseTextShadowNode.mFontFamily, reactBaseTextShadowNode.getThemedContext().getAssets())));
            }
            if (reactBaseTextShadowNode.mIsUnderlineTextDecorationSet) {
                list.add(new SetSpanOperation(i, length, new ReactUnderlineSpan()));
            }
            if (reactBaseTextShadowNode.mIsLineThroughTextDecorationSet) {
                list.add(new SetSpanOperation(i, length, new ReactStrikethroughSpan()));
            }
            if ((reactBaseTextShadowNode.mTextShadowOffsetDx != 0.0f || reactBaseTextShadowNode.mTextShadowOffsetDy != 0.0f || reactBaseTextShadowNode.mTextShadowRadius != 0.0f) && Color.alpha(reactBaseTextShadowNode.mTextShadowColor) != 0) {
                list.add(new SetSpanOperation(i, length, new ShadowStyleSpan(reactBaseTextShadowNode.mTextShadowOffsetDx, reactBaseTextShadowNode.mTextShadowOffsetDy, reactBaseTextShadowNode.mTextShadowRadius, reactBaseTextShadowNode.mTextShadowColor)));
            }
            float effectiveLineHeight = textAttributes3.getEffectiveLineHeight();
            if (!Float.isNaN(effectiveLineHeight) && (textAttributes == null || textAttributes.getEffectiveLineHeight() != effectiveLineHeight)) {
                list.add(new SetSpanOperation(i, length, new CustomLineHeightSpan(effectiveLineHeight)));
            }
            list.add(new SetSpanOperation(i, length, new ReactTagSpan(reactBaseTextShadowNode.getReactTag())));
        }
    }

    private static void buildSpannedFromShadowNodeUnified(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list, TextAttributes textAttributes, boolean z, Map<Integer, ReactShadowNode> map, int i) {
        TextAttributes textAttributes2;
        if (textAttributes != null) {
            textAttributes2 = textAttributes.applyChild(reactBaseTextShadowNode.mTextAttributes);
        } else {
            textAttributes2 = reactBaseTextShadowNode.mTextAttributes;
        }
        TextAttributes textAttributes3 = textAttributes2;
        HierarchicTextAttributeProvider hierarchicTextAttributeProvider = new HierarchicTextAttributeProvider(reactBaseTextShadowNode, textAttributes, textAttributes3);
        int childCount = reactBaseTextShadowNode.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ReactShadowNodeImpl childAt = reactBaseTextShadowNode.getChildAt(i2);
            if (childAt instanceof ReactRawTextShadowNode) {
                TextLayoutUtils.addText(spannableStringBuilder, ((ReactRawTextShadowNode) childAt).getText(), hierarchicTextAttributeProvider);
            } else if (childAt instanceof ReactBaseTextShadowNode) {
                buildSpannedFromShadowNodeUnified((ReactBaseTextShadowNode) childAt, spannableStringBuilder, list, textAttributes3, z, map, spannableStringBuilder.length());
            } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                addInlineImageSpan(list, spannableStringBuilder, (ReactTextInlineImageShadowNode) childAt);
            } else if (z) {
                addInlineViewPlaceholderSpan(list, spannableStringBuilder, childAt);
                map.put(Integer.valueOf(childAt.getReactTag()), childAt);
                childAt.markUpdateSeen();
            } else {
                throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            TextLayoutUtils.addApplicableTextAttributeSpans(list, hierarchicTextAttributeProvider, reactBaseTextShadowNode.getReactTag(), reactBaseTextShadowNode.getThemedContext(), i, length);
        }
    }

    private static void addInlineImageSpan(List<SetSpanOperation> list, SpannableStringBuilder spannableStringBuilder, ReactTextInlineImageShadowNode reactTextInlineImageShadowNode) {
        spannableStringBuilder.append(INLINE_VIEW_PLACEHOLDER);
        list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), reactTextInlineImageShadowNode.buildInlineImageSpan()));
    }

    private static void addInlineViewPlaceholderSpan(List<SetSpanOperation> list, SpannableStringBuilder spannableStringBuilder, ReactShadowNode reactShadowNode) {
        float layoutWidth;
        float layoutHeight;
        YogaValue styleWidth = reactShadowNode.getStyleWidth();
        YogaValue styleHeight = reactShadowNode.getStyleHeight();
        if (styleWidth.unit != YogaUnit.POINT || styleHeight.unit != YogaUnit.POINT) {
            reactShadowNode.calculateLayout();
            layoutWidth = reactShadowNode.getLayoutWidth();
            layoutHeight = reactShadowNode.getLayoutHeight();
        } else {
            layoutWidth = styleWidth.value;
            layoutHeight = styleHeight.value;
        }
        spannableStringBuilder.append(INLINE_VIEW_PLACEHOLDER);
        TextLayoutUtils.addInlineViewPlaceholderSpan(list, spannableStringBuilder, reactShadowNode.getReactTag(), layoutWidth, layoutHeight);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Spannable spannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, String str, boolean z, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        int i;
        Assertions.assertCondition((z && nativeViewHierarchyOptimizer == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = z ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) TextTransform.apply(str, reactBaseTextShadowNode.mTextAttributes.getTextTransform()));
        }
        buildSpannedFromShadowNode(reactBaseTextShadowNode, spannableStringBuilder, arrayList, null, z, hashMap, 0);
        reactBaseTextShadowNode.mContainsImages = false;
        reactBaseTextShadowNode.mInlineViews = hashMap;
        float f = Float.NaN;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            SetSpanOperation setSpanOperation = (SetSpanOperation) arrayList.get((arrayList.size() - i2) - 1);
            ReactSpan what = setSpanOperation.getWhat();
            boolean z2 = what instanceof TextInlineImageSpan;
            if (z2 || (what instanceof TextInlineViewPlaceholderSpan)) {
                if (z2) {
                    i = ((TextInlineImageSpan) what).getHeight();
                    reactBaseTextShadowNode.mContainsImages = true;
                } else {
                    TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = (TextInlineViewPlaceholderSpan) what;
                    int height = textInlineViewPlaceholderSpan.getHeight();
                    ReactShadowNode reactShadowNode = (ReactShadowNode) hashMap.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag()));
                    nativeViewHierarchyOptimizer.handleForceViewToBeNonLayoutOnly(reactShadowNode);
                    reactShadowNode.setLayoutParent(reactBaseTextShadowNode);
                    i = height;
                }
                if (Float.isNaN(f) || i > f) {
                    f = i;
                }
            }
            setSpanOperation.execute(spannableStringBuilder, i2);
        }
        reactBaseTextShadowNode.mTextAttributes.setHeightOfTallestInlineViewOrImage(f);
        ReactTextViewManagerCallback reactTextViewManagerCallback = this.mReactTextViewManagerCallback;
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public ReactBaseTextShadowNode() {
        this(null);
    }

    public ReactBaseTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.mIsColorSet = false;
        this.mIsBackgroundColorSet = false;
        this.mAccessibilityRole = null;
        this.mRole = null;
        this.mNumberOfLines = -1;
        this.mTextAlign = 0;
        this.mTextBreakStrategy = 1;
        this.mHyphenationFrequency = 0;
        this.mJustificationMode = 0;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 0.0f;
        this.mTextShadowColor = DEFAULT_TEXT_SHADOW_COLOR;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mAdjustsFontSizeToFit = false;
        this.mMinimumFontScale = 0.0f;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mFontFeatureSettings = null;
        this.mContainsImages = false;
        this.mTextAttributes = new TextAttributes();
        this.mReactTextViewManagerCallback = reactTextViewManagerCallback;
    }

    private int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    @ReactProp(defaultInt = -1, name = ViewProps.NUMBER_OF_LINES)
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.mNumberOfLines = i;
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.LINE_HEIGHT)
    public void setLineHeight(float f) {
        this.mTextAttributes.setLineHeight(f);
        markUpdated();
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public void setLetterSpacing(float f) {
        this.mTextAttributes.setLetterSpacing(f);
        markUpdated();
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public void setAllowFontScaling(boolean z) {
        if (z != this.mTextAttributes.getAllowFontScaling()) {
            this.mTextAttributes.setAllowFontScaling(z);
            markUpdated();
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.mTextAttributes.getMaxFontSizeMultiplier()) {
            this.mTextAttributes.setMaxFontSizeMultiplier(f);
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.TEXT_ALIGN)
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 1;
            }
            this.mTextAlign = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.mTextAlign = 0;
            } else if (ViewProps.LEFT.equals(str)) {
                this.mTextAlign = 3;
            } else if (ViewProps.RIGHT.equals(str)) {
                this.mTextAlign = 5;
            } else if ("center".equals(str)) {
                this.mTextAlign = 1;
            } else {
                FLog.w(ReactConstants.TAG, "Invalid textAlign: " + str);
                this.mTextAlign = 0;
            }
        }
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.FONT_SIZE)
    public void setFontSize(float f) {
        this.mTextAttributes.setFontSize(f);
        markUpdated();
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(Integer num) {
        boolean z = num != null;
        this.mIsColorSet = z;
        if (z) {
            this.mColor = num.intValue();
        }
        markUpdated();
    }

    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(Integer num) {
        if (isVirtual()) {
            boolean z = num != null;
            this.mIsBackgroundColorSet = z;
            if (z) {
                this.mBackgroundColor = num.intValue();
            }
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(String str) {
        if (isVirtual()) {
            this.mAccessibilityRole = ReactAccessibilityDelegate.AccessibilityRole.fromValue(str);
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.ROLE)
    public void setRole(String str) {
        if (isVirtual()) {
            this.mRole = ReactAccessibilityDelegate.Role.fromValue(str);
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.FONT_FAMILY)
    public void setFontFamily(String str) {
        this.mFontFamily = str;
        markUpdated();
    }

    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public void setFontWeight(String str) {
        int parseFontWeight = ReactTypefaceUtils.parseFontWeight(str);
        if (parseFontWeight != this.mFontWeight) {
            this.mFontWeight = parseFontWeight;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public void setFontVariant(ReadableArray readableArray) {
        String parseFontVariant = ReactTypefaceUtils.parseFontVariant(readableArray);
        if (TextUtils.equals(parseFontVariant, this.mFontFeatureSettings)) {
            return;
        }
        this.mFontFeatureSettings = parseFontVariant;
        markUpdated();
    }

    @ReactProp(name = ViewProps.FONT_STYLE)
    public void setFontStyle(String str) {
        int parseFontStyle = ReactTypefaceUtils.parseFontStyle(str);
        if (parseFontStyle != this.mFontStyle) {
            this.mFontStyle = parseFontStyle;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public void setTextDecorationLine(String str) {
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("line-through".equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.TEXT_BREAK_STRATEGY)
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.mTextBreakStrategy = 1;
        } else if ("simple".equals(str)) {
            this.mTextBreakStrategy = 0;
        } else if ("balanced".equals(str)) {
            this.mTextBreakStrategy = 2;
        } else {
            FLog.w(ReactConstants.TAG, "Invalid textBreakStrategy: " + str);
            this.mTextBreakStrategy = 1;
        }
        markUpdated();
    }

    @ReactProp(name = PROP_SHADOW_OFFSET)
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = PROP_SHADOW_RADIUS)
    public void setTextShadowRadius(float f) {
        if (f != this.mTextShadowRadius) {
            this.mTextShadowRadius = f;
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", defaultInt = DEFAULT_TEXT_SHADOW_COLOR, name = PROP_SHADOW_COLOR)
    public void setTextShadowColor(int i) {
        if (i != this.mTextShadowColor) {
            this.mTextShadowColor = i;
            markUpdated();
        }
    }

    @ReactProp(name = PROP_TEXT_TRANSFORM)
    public void setTextTransform(String str) {
        if (str == null) {
            this.mTextAttributes.setTextTransform(TextTransform.UNSET);
        } else if ("none".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.NONE);
        } else if ("uppercase".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.CAPITALIZE);
        } else {
            FLog.w(ReactConstants.TAG, "Invalid textTransform: " + str);
            this.mTextAttributes.setTextTransform(TextTransform.UNSET);
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.mAdjustsFontSizeToFit) {
            this.mAdjustsFontSizeToFit = z;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.MINIMUM_FONT_SCALE)
    public void setMinimumFontScale(float f) {
        if (f != this.mMinimumFontScale) {
            this.mMinimumFontScale = f;
            markUpdated();
        }
    }
}
