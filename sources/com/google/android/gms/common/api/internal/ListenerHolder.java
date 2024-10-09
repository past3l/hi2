package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class ListenerHolder<L> {
    private final zaa zajj;
    private volatile L zajk;
    private final ListenerKey<L> zajl;

    /* loaded from: classes.dex */
    public interface Notifier<L> {
        void notifyListener(L l);

        void onNotifyListenerFailed();
    }

    /* loaded from: classes.dex */
    private final class zaa extends com.google.android.gms.internal.base.zap {
        public zaa(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Preconditions.checkArgument(message.what == 1);
            ListenerHolder.this.notifyListenerInternal((Notifier) message.obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListenerHolder(Looper looper, L l, String str) {
        this.zajj = new zaa(looper);
        this.zajk = (L) Preconditions.checkNotNull(l, "Listener must not be null");
        this.zajl = new ListenerKey<>(l, Preconditions.checkNotEmpty(str));
    }

    public final void clear() {
        this.zajk = null;
    }

    public final ListenerKey<L> getListenerKey() {
        return this.zajl;
    }

    public final boolean hasListener() {
        return this.zajk != null;
    }

    /* loaded from: classes.dex */
    public static final class ListenerKey<L> {
        private final L zajk;
        private final String zajn;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ListenerKey(L l, String str) {
            this.zajk = l;
            this.zajn = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zajk == listenerKey.zajk && this.zajn.equals(listenerKey.zajn);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zajk) * 31) + this.zajn.hashCode();
        }
    }

    public final void notifyListener(Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zajj.sendMessage(this.zajj.obtainMessage(1, notifier));
    }

    final void notifyListenerInternal(Notifier<? super L> notifier) {
        L l = this.zajk;
        if (l == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l);
        } catch (RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }
}
