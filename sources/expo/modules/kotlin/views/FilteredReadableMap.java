package expo.modules.kotlin.views;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.Filter;
import expo.modules.kotlin.FilteredIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FilteredReadableMap.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0097\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0097\u0001J\u001f\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t0\bH\u0017¢\u0006\u0002\b\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0096\u0001J\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0097\u0001J\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0097\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0097\u0001J\u0013\u0010 \u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010!\u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0096\u0001J\b\u0010\"\u001a\u00020#H\u0016J%\u0010$\u001a\u001e\u0012\f\u0012\n &*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n &*\u0004\u0018\u00010\n0\n0%H\u0097\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t0\b8WX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lexpo/modules/kotlin/views/FilteredReadableMap;", "Lcom/facebook/react/bridge/ReadableMap;", "backingMap", "filteredKeys", "", "", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/util/List;)V", "entryIterator", "", "", "", "getEntryIteratorFromProperty$annotations", "()V", "getEntryIteratorFromProperty", "()Ljava/util/Iterator;", "getArray", "Lcom/facebook/react/bridge/ReadableArray;", "p0", "getBoolean", "", "getDouble", "", "getDynamic", "Lcom/facebook/react/bridge/Dynamic;", "getEntryIterator", "getEntryIteratorFromFunction", "getInt", "", "getMap", "getString", "getType", "Lcom/facebook/react/bridge/ReadableType;", "hasKey", "isNull", "keySetIterator", "Lcom/facebook/react/bridge/ReadableMapKeySetIterator;", "toHashMap", "Ljava/util/HashMap;", "kotlin.jvm.PlatformType", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilteredReadableMap implements ReadableMap {
    private final ReadableMap backingMap;
    private final Iterator<Map.Entry<String, Object>> entryIterator;
    private final List<String> filteredKeys;

    public static /* synthetic */ void getEntryIteratorFromProperty$annotations() {
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.getArray(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.getBoolean(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.getDouble(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.getDynamic(p0);
    }

    public Iterator<Map.Entry<String, Object>> getEntryIteratorFromProperty() {
        return this.entryIterator;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.getInt(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMap getMap(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.getMap(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.getString(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.getType(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.hasKey(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return this.backingMap.isNull(p0);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        return this.backingMap.toHashMap();
    }

    public FilteredReadableMap(ReadableMap backingMap, List<String> filteredKeys) {
        Intrinsics.checkNotNullParameter(backingMap, "backingMap");
        Intrinsics.checkNotNullParameter(filteredKeys, "filteredKeys");
        this.backingMap = backingMap;
        this.filteredKeys = filteredKeys;
        Iterator<Map.Entry<String, Object>> entryIterator = backingMap.getEntryIterator();
        Intrinsics.checkNotNullExpressionValue(entryIterator, "getEntryIterator(...)");
        this.entryIterator = new FilteredIterator(entryIterator, new Filter() { // from class: expo.modules.kotlin.views.FilteredReadableMap$$ExternalSyntheticLambda1
            @Override // expo.modules.kotlin.Filter
            public final boolean apply(Object obj) {
                boolean entryIterator$lambda$0;
                entryIterator$lambda$0 = FilteredReadableMap.entryIterator$lambda$0(FilteredReadableMap.this, (Map.Entry) obj);
                return entryIterator$lambda$0;
            }
        });
    }

    @Override // com.facebook.react.bridge.ReadableMap
    /* renamed from: getEntryIteratorFromFunction, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        return getEntryIteratorFromProperty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean entryIterator$lambda$0(FilteredReadableMap this$0, Map.Entry entry) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return !this$0.filteredKeys.contains(entry.getKey());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        ReadableMapKeySetIterator keySetIterator = this.backingMap.keySetIterator();
        Intrinsics.checkNotNullExpressionValue(keySetIterator, "keySetIterator(...)");
        return new FilteredReadableMapKeySetIterator(keySetIterator, new Filter() { // from class: expo.modules.kotlin.views.FilteredReadableMap$$ExternalSyntheticLambda0
            @Override // expo.modules.kotlin.Filter
            public final boolean apply(Object obj) {
                boolean keySetIterator$lambda$1;
                keySetIterator$lambda$1 = FilteredReadableMap.keySetIterator$lambda$1(FilteredReadableMap.this, (String) obj);
                return keySetIterator$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean keySetIterator$lambda$1(FilteredReadableMap this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return !this$0.filteredKeys.contains(it);
    }
}
