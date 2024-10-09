package com.facebook.react.devsupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface IInspectorPackagerConnection {
    void closeQuietly();

    void connect();

    void sendEventToAllConnections(String str);
}
