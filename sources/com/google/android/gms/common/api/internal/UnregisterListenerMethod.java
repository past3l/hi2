package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder.ListenerKey<L> zajl;

    /* JADX INFO: Access modifiers changed from: protected */
    public UnregisterListenerMethod(ListenerHolder.ListenerKey<L> listenerKey) {
        this.zajl = listenerKey;
    }

    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zajl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void unregisterListener(A a, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
