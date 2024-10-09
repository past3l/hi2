package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zadn = new zap();
    private zaa mResultGuardian;
    private Status mStatus;
    private R zacj;
    private final Object zado;
    private final CallbackHandler<R> zadp;
    private final WeakReference<GoogleApiClient> zadq;
    private final CountDownLatch zadr;
    private final ArrayList<PendingResult.StatusListener> zads;
    private ResultCallback<? super R> zadt;
    private final AtomicReference<zacs> zadu;
    private volatile boolean zadv;
    private boolean zadw;
    private boolean zadx;
    private ICancelToken zady;
    private volatile zacm<R> zadz;
    private boolean zaea;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class zaa {
        private zaa() {
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.zab(BasePendingResult.this.zacj);
            super.finalize();
        }

        /* synthetic */ zaa(BasePendingResult basePendingResult, zap zapVar) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zado = new Object();
        this.zadr = new CountDownLatch(1);
        this.zads = new ArrayList<>();
        this.zadu = new AtomicReference<>();
        this.zaea = false;
        this.zadp = new CallbackHandler<>(Looper.getMainLooper());
        this.zadq = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract R createFailedResult(Status status);

    @Override // com.google.android.gms.common.api.PendingResult
    public final Integer zam() {
        return null;
    }

    /* loaded from: classes.dex */
    public static class CallbackHandler<R extends Result> extends com.google.android.gms.internal.base.zap {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        public final void zaa(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                    return;
                } catch (RuntimeException e) {
                    BasePendingResult.zab(result);
                    throw e;
                }
            }
            if (i == 2) {
                ((BasePendingResult) message.obj).zab(Status.RESULT_TIMEOUT);
                return;
            }
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.zado = new Object();
        this.zadr = new CountDownLatch(1);
        this.zads = new ArrayList<>();
        this.zadu = new AtomicReference<>();
        this.zaea = false;
        this.zadp = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zadq = new WeakReference<>(googleApiClient);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zado = new Object();
        this.zadr = new CountDownLatch(1);
        this.zads = new ArrayList<>();
        this.zadu = new AtomicReference<>();
        this.zaea = false;
        this.zadp = new CallbackHandler<>(looper);
        this.zadq = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(CallbackHandler<R> callbackHandler) {
        this.zado = new Object();
        this.zadr = new CountDownLatch(1);
        this.zads = new ArrayList<>();
        this.zadu = new AtomicReference<>();
        this.zaea = false;
        this.zadp = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zadq = new WeakReference<>(null);
    }

    public final boolean isReady() {
        return this.zadr.getCount() == 0;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        Preconditions.checkState(!this.zadv, "Result has already been consumed");
        Preconditions.checkState(this.zadz == null, "Cannot await if then() has been called.");
        try {
            this.zadr.await();
        } catch (InterruptedException unused) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.checkState(!this.zadv, "Result has already been consumed.");
        Preconditions.checkState(this.zadz == null, "Cannot await if then() has been called.");
        try {
            if (!this.zadr.await(j, timeUnit)) {
                zab(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(ResultCallback<? super R> resultCallback) {
        synchronized (this.zado) {
            if (resultCallback == null) {
                this.zadt = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.zadv, "Result has already been consumed.");
            if (this.zadz != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zadp.zaa(resultCallback, get());
            } else {
                this.zadt = resultCallback;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(ResultCallback<? super R> resultCallback, long j, TimeUnit timeUnit) {
        synchronized (this.zado) {
            if (resultCallback == null) {
                this.zadt = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.zadv, "Result has already been consumed.");
            if (this.zadz != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if (isCanceled()) {
                return;
            }
            if (isReady()) {
                this.zadp.zaa(resultCallback, get());
            } else {
                this.zadt = resultCallback;
                CallbackHandler<R> callbackHandler = this.zadp;
                callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zado) {
            if (isReady()) {
                statusListener.onComplete(this.mStatus);
            } else {
                this.zads.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void cancel() {
        synchronized (this.zado) {
            if (!this.zadw && !this.zadv) {
                ICancelToken iCancelToken = this.zady;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zab(this.zacj);
                this.zadw = true;
                zaa((BasePendingResult<R>) createFailedResult(Status.RESULT_CANCELED));
            }
        }
    }

    public final boolean zat() {
        boolean isCanceled;
        synchronized (this.zado) {
            if (this.zadq.get() == null || !this.zaea) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public boolean isCanceled() {
        boolean z;
        synchronized (this.zado) {
            z = this.zadw;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        Preconditions.checkState(!this.zadv, "Result has already been consumed.");
        synchronized (this.zado) {
            Preconditions.checkState(this.zadz == null, "Cannot call then() twice.");
            Preconditions.checkState(this.zadt == null, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(!this.zadw, "Cannot call then() if result was canceled.");
            this.zaea = true;
            this.zadz = new zacm<>(this.zadq);
            then = this.zadz.then(resultTransform);
            if (isReady()) {
                this.zadp.zaa(this.zadz, get());
            } else {
                this.zadt = this.zadz;
            }
        }
        return then;
    }

    public final void setResult(R r) {
        synchronized (this.zado) {
            if (!this.zadx && !this.zadw) {
                isReady();
                Preconditions.checkState(!isReady(), "Results have already been set");
                Preconditions.checkState(!this.zadv, "Result has already been consumed");
                zaa((BasePendingResult<R>) r);
                return;
            }
            zab(r);
        }
    }

    public final void zab(Status status) {
        synchronized (this.zado) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zadx = true;
            }
        }
    }

    public final void zaa(zacs zacsVar) {
        this.zadu.set(zacsVar);
    }

    protected final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zado) {
            this.zady = iCancelToken;
        }
    }

    public final void zau() {
        this.zaea = this.zaea || zadn.get().booleanValue();
    }

    private final R get() {
        R r;
        synchronized (this.zado) {
            Preconditions.checkState(!this.zadv, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.zacj;
            this.zacj = null;
            this.zadt = null;
            this.zadv = true;
        }
        zacs andSet = this.zadu.getAndSet(null);
        if (andSet != null) {
            andSet.zac(this);
        }
        return r;
    }

    private final void zaa(R r) {
        this.zacj = r;
        zap zapVar = null;
        this.zady = null;
        this.zadr.countDown();
        this.mStatus = this.zacj.getStatus();
        if (this.zadw) {
            this.zadt = null;
        } else if (this.zadt == null) {
            if (this.zacj instanceof Releasable) {
                this.mResultGuardian = new zaa(this, zapVar);
            }
        } else {
            this.zadp.removeMessages(2);
            this.zadp.zaa(this.zadt, get());
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.zads;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            PendingResult.StatusListener statusListener = arrayList.get(i);
            i++;
            statusListener.onComplete(this.mStatus);
        }
        this.zads.clear();
    }

    public static void zab(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }
}
