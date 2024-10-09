package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.learnium.RNDeviceInfo.RNInstallReferrerClient;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class RNInstallReferrerClient {
    private static Class<?> InstallReferrerClientClazz = null;
    private static Class<?> InstallReferrerStateListenerClazz = null;
    private static final int R_RESPONSE_FEATURE_NOT_SUPPORTED = 2;
    private static final int R_RESPONSE_OK = 0;
    private static final int R_RESPONSE_SERVICE_UNAVAILABLE = 1;
    private static Class<?> ReferrerDetailsClazz;
    private final ExecutorService executorService;
    private Object installReferrerStateListener;
    private Object mReferrerClient;
    private final Handler mainHandler;
    private final SharedPreferences sharedPreferences;

    static {
        try {
            InstallReferrerClientClazz = Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            InstallReferrerStateListenerClazz = Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
            ReferrerDetailsClazz = Class.forName("com.android.installreferrer.api.ReferrerDetails");
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RNInstallReferrerClient(final Context context) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.executorService = newSingleThreadExecutor;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.sharedPreferences = context.getSharedPreferences("react-native-device-info", 0);
        if (InstallReferrerClientClazz == null || InstallReferrerStateListenerClazz == null || ReferrerDetailsClazz == null) {
            return;
        }
        newSingleThreadExecutor.execute(new Runnable() { // from class: com.learnium.RNDeviceInfo.RNInstallReferrerClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RNInstallReferrerClient.this.lambda$new$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Context context) {
        try {
            Object invoke = InstallReferrerClientClazz.getMethod("newBuilder", Context.class).invoke(null, context);
            this.mReferrerClient = invoke.getClass().getMethod("build", new Class[0]).invoke(invoke, new Object[0]);
            this.installReferrerStateListener = Proxy.newProxyInstance(InstallReferrerStateListenerClazz.getClassLoader(), new Class[]{InstallReferrerStateListenerClazz}, new InstallReferrerStateListenerProxy());
            InstallReferrerClientClazz.getMethod("startConnection", InstallReferrerStateListenerClazz).invoke(this.mReferrerClient, this.installReferrerStateListener);
        } catch (Exception e) {
            System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class InstallReferrerStateListenerProxy implements InvocationHandler {
        private InstallReferrerStateListenerProxy() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof Integer) {
                        final int intValue = ((Integer) obj2).intValue();
                        RNInstallReferrerClient.this.mainHandler.post(new Runnable() { // from class: com.learnium.RNDeviceInfo.RNInstallReferrerClient.InstallReferrerStateListenerProxy.1
                            @Override // java.lang.Runnable
                            public void run() {
                                InstallReferrerStateListenerProxy.this.onInstallReferrerSetupFinished(intValue);
                            }
                        });
                        return null;
                    }
                }
                if (!name.equals("onInstallReferrerServiceDisconnected")) {
                    return null;
                }
                RNInstallReferrerClient.this.mainHandler.post(new Runnable() { // from class: com.learnium.RNDeviceInfo.RNInstallReferrerClient.InstallReferrerStateListenerProxy.2
                    @Override // java.lang.Runnable
                    public void run() {
                        InstallReferrerStateListenerProxy.this.onInstallReferrerServiceDisconnected();
                    }
                });
                return null;
            } catch (Exception e) {
                throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0() {
            try {
                Log.d("InstallReferrerState", "OK");
                String str = (String) RNInstallReferrerClient.ReferrerDetailsClazz.getMethod("getInstallReferrer", new Class[0]).invoke(RNInstallReferrerClient.InstallReferrerClientClazz.getMethod("getInstallReferrer", new Class[0]).invoke(RNInstallReferrerClient.this.mReferrerClient, new Object[0]), new Object[0]);
                SharedPreferences.Editor edit = RNInstallReferrerClient.this.sharedPreferences.edit();
                edit.putString("installReferrer", str);
                edit.apply();
                RNInstallReferrerClient.InstallReferrerClientClazz.getMethod("endConnection", new Class[0]).invoke(RNInstallReferrerClient.this.mReferrerClient, new Object[0]);
            } catch (Exception e) {
                System.err.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e.getMessage());
                e.printStackTrace(System.err);
            }
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                RNInstallReferrerClient.this.executorService.execute(new Runnable() { // from class: com.learnium.RNDeviceInfo.RNInstallReferrerClient$InstallReferrerStateListenerProxy$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RNInstallReferrerClient.InstallReferrerStateListenerProxy.this.lambda$onInstallReferrerSetupFinished$0();
                    }
                });
            } else if (i == 1) {
                Log.d("InstallReferrerState", "SERVICE_UNAVAILABLE");
            } else {
                if (i != 2) {
                    return;
                }
                Log.d("InstallReferrerState", "FEATURE_NOT_SUPPORTED");
            }
        }

        public void onInstallReferrerServiceDisconnected() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }
    }
}
