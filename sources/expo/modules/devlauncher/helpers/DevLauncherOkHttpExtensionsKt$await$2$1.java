package expo.modules.devlauncher.helpers;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: DevLauncherOkHttpExtensions.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"expo/modules/devlauncher/helpers/DevLauncherOkHttpExtensionsKt$await$2$1", "Lokhttp3/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "expo-dev-launcher_release"}, k = 1, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class DevLauncherOkHttpExtensionsKt$await$2$1 implements Callback {
    final /* synthetic */ CancellableContinuation<Response> $callback;

    /* JADX WARN: Multi-variable type inference failed */
    public DevLauncherOkHttpExtensionsKt$await$2$1(CancellableContinuation<? super Response> cancellableContinuation) {
        this.$callback = cancellableContinuation;
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        CancellableContinuation<Response> cancellableContinuation = this.$callback;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m604constructorimpl(response));
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.$callback.isCancelled()) {
            return;
        }
        CancellableContinuation<Response> cancellableContinuation = this.$callback;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m604constructorimpl(ResultKt.createFailure(e)));
    }
}
