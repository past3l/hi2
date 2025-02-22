package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.util.OptionalInt;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CxxInspectorPackagerConnection implements IInspectorPackagerConnection {
    private final HybridData mHybridData;

    /* loaded from: classes.dex */
    private interface IWebSocket extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        void send(String str);
    }

    private static native HybridData initHybrid(String str, String str2, DelegateImpl delegateImpl);

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void closeQuietly();

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void connect();

    @Override // com.facebook.react.devsupport.IInspectorPackagerConnection
    public native void sendEventToAllConnections(String str);

    static {
        DevSupportSoLoader.staticInit();
    }

    public CxxInspectorPackagerConnection(String str, String str2) {
        this.mHybridData = initHybrid(str, str2, new DelegateImpl());
    }

    /* loaded from: classes.dex */
    private static class WebSocketDelegate implements Closeable {
        private final HybridData mHybridData;

        public native void didClose();

        public native void didFailWithError(OptionalInt optionalInt, String str);

        public native void didReceiveMessage(String str);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mHybridData.resetNative();
        }

        private WebSocketDelegate(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    /* loaded from: classes.dex */
    private static class DelegateImpl {
        private final Handler mHandler;
        private final OkHttpClient mHttpClient;

        private DelegateImpl() {
            this.mHttpClient = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
            this.mHandler = new Handler(Looper.getMainLooper());
        }

        public IWebSocket connectWebSocket(String str, final WebSocketDelegate webSocketDelegate) {
            final WebSocket newWebSocket = this.mHttpClient.newWebSocket(new Request.Builder().url(str).build(), new WebSocketListener() { // from class: com.facebook.react.devsupport.CxxInspectorPackagerConnection.DelegateImpl.1
                @Override // okhttp3.WebSocketListener
                public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                    OptionalInt empty;
                    String message = th.getMessage();
                    WebSocketDelegate webSocketDelegate2 = webSocketDelegate;
                    empty = OptionalInt.empty();
                    if (message == null) {
                        message = "<Unknown error>";
                    }
                    webSocketDelegate2.didFailWithError(empty, message);
                    webSocketDelegate.close();
                }

                @Override // okhttp3.WebSocketListener
                public void onMessage(WebSocket webSocket, String str2) {
                    webSocketDelegate.didReceiveMessage(str2);
                }

                @Override // okhttp3.WebSocketListener
                public void onClosed(WebSocket webSocket, int i, String str2) {
                    webSocketDelegate.didClose();
                    webSocketDelegate.close();
                }
            });
            return new IWebSocket() { // from class: com.facebook.react.devsupport.CxxInspectorPackagerConnection.DelegateImpl.2
                @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket
                public void send(String str2) {
                    newWebSocket.send(str2);
                }

                @Override // com.facebook.react.devsupport.CxxInspectorPackagerConnection.IWebSocket, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    newWebSocket.close(1000, "End of session");
                }
            };
        }

        public void scheduleCallback(Runnable runnable, long j) {
            this.mHandler.postDelayed(runnable, j);
        }
    }
}
