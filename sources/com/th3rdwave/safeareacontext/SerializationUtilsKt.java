package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SerializationUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, d2 = {"edgeInsetsToJavaMap", "", "", "", "insets", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "edgeInsetsToJsMap", "Lcom/facebook/react/bridge/WritableMap;", "rectToJavaMap", "rect", "Lcom/th3rdwave/safeareacontext/Rect;", "rectToJsMap", "react-native-safe-area-context_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerializationUtilsKt {
    public static final WritableMap edgeInsetsToJsMap(EdgeInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(insets.getTop()));
        createMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(insets.getRight()));
        createMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(insets.getBottom()));
        createMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(insets.getLeft()));
        Intrinsics.checkNotNull(createMap);
        return createMap;
    }

    public static final Map<String, Float> edgeInsetsToJavaMap(EdgeInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return MapsKt.mapOf(TuplesKt.to(ViewProps.TOP, Float.valueOf(PixelUtil.toDIPFromPixel(insets.getTop()))), TuplesKt.to(ViewProps.RIGHT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.getRight()))), TuplesKt.to(ViewProps.BOTTOM, Float.valueOf(PixelUtil.toDIPFromPixel(insets.getBottom()))), TuplesKt.to(ViewProps.LEFT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.getLeft()))));
    }

    public static final WritableMap rectToJsMap(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", PixelUtil.toDIPFromPixel(rect.getX()));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(rect.getY()));
        createMap.putDouble("width", PixelUtil.toDIPFromPixel(rect.getWidth()));
        createMap.putDouble("height", PixelUtil.toDIPFromPixel(rect.getHeight()));
        Intrinsics.checkNotNull(createMap);
        return createMap;
    }

    public static final Map<String, Float> rectToJavaMap(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return MapsKt.mapOf(TuplesKt.to("x", Float.valueOf(PixelUtil.toDIPFromPixel(rect.getX()))), TuplesKt.to("y", Float.valueOf(PixelUtil.toDIPFromPixel(rect.getY()))), TuplesKt.to("width", Float.valueOf(PixelUtil.toDIPFromPixel(rect.getWidth()))), TuplesKt.to("height", Float.valueOf(PixelUtil.toDIPFromPixel(rect.getHeight()))));
    }
}
