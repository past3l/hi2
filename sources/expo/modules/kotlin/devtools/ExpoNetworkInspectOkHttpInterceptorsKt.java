package expo.modules.kotlin.devtools;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Source;

/* compiled from: ExpoNetworkInspectOkHttpInterceptors.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"TAG", "", "delegate", "Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "getDelegate", "()Lexpo/modules/kotlin/devtools/ExpoNetworkInspectOkHttpInterceptorsDelegate;", "peekResponseBody", "Lokhttp3/ResponseBody;", "response", "Lokhttp3/Response;", "byteCount", "", "shouldParseBody", "", "expo-modules-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpoNetworkInspectOkHttpInterceptorsKt {
    private static final String TAG = "ExpoNetworkInspector";
    private static final ExpoNetworkInspectOkHttpInterceptorsDelegate delegate = ExpoRequestCdpInterceptor.INSTANCE;

    public static final ExpoNetworkInspectOkHttpInterceptorsDelegate getDelegate() {
        return delegate;
    }

    public static /* synthetic */ ResponseBody peekResponseBody$default(Response response, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1048576;
        }
        return peekResponseBody(response, j);
    }

    public static final ResponseBody peekResponseBody(Response response, long j) {
        Intrinsics.checkNotNullParameter(response, "response");
        ResponseBody body = response.body();
        if (body == null) {
            return null;
        }
        BufferedSource peek = body.getBodySource().peek();
        try {
            if (peek.request(1 + j)) {
                return null;
            }
        } catch (IOException unused) {
        }
        if (StringsKt.equals(Response.header$default(response, "Content-Encoding", null, 2, null), "gzip", true)) {
            peek = Okio.buffer(new GzipSource(peek));
            peek.request(j);
        }
        Buffer buffer = new Buffer();
        buffer.write((Source) peek, Math.min(j, peek.getBuffer().size()));
        return ResponseBody.INSTANCE.create(buffer, body.get$contentType(), buffer.size());
    }

    public static final boolean shouldParseBody(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"text/event-stream", "text/x-component", "audio", "video"});
        String header$default = Response.header$default(response, "Content-Type", null, 2, null);
        if (header$default == null) {
            header$default = "";
        }
        List list = listOf;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(header$default, (String) it.next(), false, 2, (Object) null)) {
                    return false;
                }
            }
        }
        if (StringsKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) {
            return false;
        }
        String header$default2 = Response.header$default(response, "Content-Length", null, 2, null);
        long parseLong = header$default2 != null ? Long.parseLong(header$default2) : -1L;
        return parseLong < 1 || parseLong <= 1048576;
    }
}
