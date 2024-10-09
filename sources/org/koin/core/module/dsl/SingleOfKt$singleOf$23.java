package org.koin.core.module.dsl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: SingleOf.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001\"\u0006\b\u0002\u0010\u0003\u0018\u0001\"\u0006\b\u0003\u0010\u0004\u0018\u0001\"\u0006\b\u0004\u0010\u0005\u0018\u0001\"\u0006\b\u0005\u0010\u0006\u0018\u0001\"\u0006\b\u0006\u0010\u0007\u0018\u0001\"\u0006\b\u0007\u0010\b\u0018\u0001\"\u0006\b\b\u0010\t\u0018\u0001\"\u0006\b\t\u0010\n\u0018\u0001\"\u0006\b\n\u0010\u000b\u0018\u0001\"\u0006\b\u000b\u0010\f\u0018\u0001\"\u0006\b\f\u0010\r\u0018\u0001\"\u0006\b\r\u0010\u000e\u0018\u0001\"\u0006\b\u000e\u0010\u000f\u0018\u0001\"\u0006\b\u000f\u0010\u0010\u0018\u0001\"\u0006\b\u0010\u0010\u0011\u0018\u0001\"\u0006\b\u0011\u0010\u0012\u0018\u0001\"\u0006\b\u0012\u0010\u0013\u0018\u0001\"\u0006\b\u0013\u0010\u0014\u0018\u0001\"\u0006\b\u0014\u0010\u0015\u0018\u0001\"\u0006\b\u0015\u0010\u0016\u0018\u0001\"\u0006\b\u0016\u0010\u0017\u0018\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\n¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"<anonymous>", "R", "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10", "T11", "T12", "T13", "T14", "T15", "T16", "T17", "T18", "T19", "T20", "T21", "T22", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class SingleOfKt$singleOf$23<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
    final /* synthetic */ Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleOfKt$singleOf$23(Function22<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, ? super T13, ? super T14, ? super T15, ? super T16, ? super T17, ? super T18, ? super T19, ? super T20, ? super T21, ? super T22, ? extends R> function22) {
        super(2);
        this.$constructor = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final R invoke(Scope single, ParametersHolder it) {
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> function22 = this.$constructor;
        Intrinsics.reifiedOperationMarker(4, "T1");
        Object obj = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T2");
        Object obj2 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T3");
        Object obj3 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T4");
        Object obj4 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T5");
        Object obj5 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T6");
        Object obj6 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T7");
        Object obj7 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T8");
        Object obj8 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T9");
        Object obj9 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T10");
        Object obj10 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T11");
        Object obj11 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T12");
        Object obj12 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T13");
        Object obj13 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T14");
        Object obj14 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T15");
        Object obj15 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T16");
        Object obj16 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T17");
        Object obj17 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T18");
        Object obj18 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T19");
        Object obj19 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T20");
        Object obj20 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T21");
        Object obj21 = single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
        Intrinsics.reifiedOperationMarker(4, "T22");
        return function22.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, single.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
