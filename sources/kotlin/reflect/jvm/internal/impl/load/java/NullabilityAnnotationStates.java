package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes3.dex */
public interface NullabilityAnnotationStates<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    T get(FqName fqName);

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final NullabilityAnnotationStates EMPTY = new NullabilityAnnotationStatesImpl(MapsKt.emptyMap());

        public final NullabilityAnnotationStates getEMPTY() {
            return EMPTY;
        }

        private Companion() {
        }
    }
}
