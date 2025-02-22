package expo.modules.kotlin.functions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AsyncFunctionBuilder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001\"\u0006\b\u0004\u0010\u0004\u0018\u0001\"\u0006\b\u0005\u0010\u0005\u0018\u0001\"\u0006\b\u0006\u0010\u0006\u0018\u0001\"\u0006\b\u0007\u0010\u0007\u0018\u0001*\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\tH\u008a@"}, d2 = {"R", "P0", "P1", "P2", "P3", "P4", "P5", "P6", "Lkotlinx/coroutines/CoroutineScope;", "", "", "<name for destructuring parameter 0>", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$15", f = "AsyncFunctionBuilder.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AsyncFunctionBuilder$SuspendBody$15 extends SuspendLambda implements Function3<CoroutineScope, Object[], Continuation<? super Object>, Object> {
    final /* synthetic */ Function8<P0, P1, P2, P3, P4, P5, P6, Continuation<? super R>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFunctionBuilder$SuspendBody$15(Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Continuation<? super R>, ? extends Object> function8, Continuation<? super AsyncFunctionBuilder$SuspendBody$15> continuation) {
        super(3, continuation);
        this.$block = function8;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
        AsyncFunctionBuilder$SuspendBody$15 asyncFunctionBuilder$SuspendBody$15 = new AsyncFunctionBuilder$SuspendBody$15(this.$block, continuation);
        asyncFunctionBuilder$SuspendBody$15.L$0 = objArr;
        return asyncFunctionBuilder$SuspendBody$15.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object[] objArr = (Object[]) this.L$0;
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Function8<P0, P1, P2, P3, P4, P5, P6, Continuation<? super R>, Object> function8 = this.$block;
            this.label = 1;
            obj = function8.invoke(obj2, obj3, obj4, obj5, obj6, obj7, obj8, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Object[] objArr = (Object[]) this.L$0;
        return this.$block.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], this);
    }
}
