package org.koin.dsl;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.instance.InstanceBuilderKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: ScopeSetExt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "R", "", "Lorg/koin/core/scope/Scope;", "params", "Lorg/koin/core/parameter/ParametersHolder;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ScopeSetExtKt$scoped$1<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
    public static final ScopeSetExtKt$scoped$1 INSTANCE = new ScopeSetExtKt$scoped$1();

    public ScopeSetExtKt$scoped$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final R invoke(Scope scoped, ParametersHolder params) {
        Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.reifiedOperationMarker(4, "R");
        return (R) InstanceBuilderKt.newInstance(scoped, Reflection.getOrCreateKotlinClass(Object.class), params);
    }
}
