package expo.interfaces.devmenu;

import com.facebook.react.JSEngineResolutionAlgorithm;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReactHostWrapper.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u0010\u0010(\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u0015J\b\u0010*\u001a\u00020+H\u0016J\u000e\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u0006\u0010-\u001a\u00020%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006."}, d2 = {"Lexpo/interfaces/devmenu/ReactHostWrapper;", "", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "reactHost", "Lcom/facebook/react/ReactHost;", "(Lcom/facebook/react/ReactNativeHost;Lcom/facebook/react/ReactHost;)V", "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "hasInstance", "", "getHasInstance", "()Z", "isBridgelessMode", "jsExecutorName", "", "getJsExecutorName", "()Ljava/lang/String;", "lifecycleState", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "setReactHost", "(Lcom/facebook/react/ReactHost;)V", "getReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "setReactNativeHost", "(Lcom/facebook/react/ReactNativeHost;)V", "addReactInstanceEventListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/ReactInstanceEventListener;", "destroy", "reason", "hashCode", "", "removeReactInstanceEventListener", ViewProps.START, "expo-dev-menu-interface_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReactHostWrapper {
    private final boolean isBridgelessMode;
    public ReactHost reactHost;
    public ReactNativeHost reactNativeHost;

    /* renamed from: isBridgelessMode, reason: from getter */
    public final boolean getIsBridgelessMode() {
        return this.isBridgelessMode;
    }

    public final void setReactHost(ReactHost reactHost) {
        Intrinsics.checkNotNullParameter(reactHost, "<set-?>");
        this.reactHost = reactHost;
    }

    public final void setReactNativeHost(ReactNativeHost reactNativeHost) {
        Intrinsics.checkNotNullParameter(reactNativeHost, "<set-?>");
        this.reactNativeHost = reactNativeHost;
    }

    public ReactHostWrapper(ReactNativeHost reactNativeHost, ReactHost reactHost) {
        Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
        if (!ReactFeatureFlags.enableBridgelessArchitecture) {
            setReactNativeHost(reactNativeHost);
        } else {
            if (reactHost == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            setReactHost(reactHost);
        }
        this.isBridgelessMode = ReactFeatureFlags.enableBridgelessArchitecture;
    }

    public final ReactNativeHost getReactNativeHost() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        if (reactNativeHost != null) {
            return reactNativeHost;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reactNativeHost");
        return null;
    }

    public final ReactHost getReactHost() {
        ReactHost reactHost = this.reactHost;
        if (reactHost != null) {
            return reactHost;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reactHost");
        return null;
    }

    public int hashCode() {
        if (this.isBridgelessMode) {
            return getReactHost().hashCode();
        }
        return getReactNativeHost().hashCode();
    }

    public final ReactContext getCurrentReactContext() {
        if (this.isBridgelessMode) {
            return getReactHost().getCurrentReactContext();
        }
        return getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
    }

    public final LifecycleState getLifecycleState() {
        if (this.isBridgelessMode) {
            return getReactHost().getLifecycleState();
        }
        LifecycleState lifecycleState = getReactNativeHost().getReactInstanceManager().getLifecycleState();
        Intrinsics.checkNotNull(lifecycleState);
        return lifecycleState;
    }

    public final boolean getHasInstance() {
        ReactContext currentReactContext;
        if (!this.isBridgelessMode) {
            return getReactNativeHost().hasInstance() && (currentReactContext = getCurrentReactContext()) != null && currentReactContext.hasActiveReactInstance();
        }
        ReactContext currentReactContext2 = getCurrentReactContext();
        if (currentReactContext2 != null) {
            return currentReactContext2.hasActiveReactInstance();
        }
        return false;
    }

    public final DevSupportManager getDevSupportManager() {
        if (this.isBridgelessMode) {
            return getReactHost().getDevSupportManager();
        }
        return getReactNativeHost().getReactInstanceManager().getDevSupportManager();
    }

    public final String getJsExecutorName() {
        if (this.isBridgelessMode) {
            return getReactHost().getJsEngineResolutionAlgorithm() == JSEngineResolutionAlgorithm.JSC ? "JSC" : "Hermes";
        }
        String jsExecutorName = getReactNativeHost().getReactInstanceManager().getJsExecutorName();
        Intrinsics.checkNotNullExpressionValue(jsExecutorName, "getJsExecutorName(...)");
        return jsExecutorName;
    }

    public final void addReactInstanceEventListener(ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.isBridgelessMode) {
            ReactHost reactHost = getReactHost();
            Intrinsics.checkNotNull(reactHost, "null cannot be cast to non-null type com.facebook.react.runtime.ReactHostImpl");
            ((ReactHostImpl) reactHost).addReactInstanceEventListener(listener);
            return;
        }
        getReactNativeHost().getReactInstanceManager().addReactInstanceEventListener(listener);
    }

    public final void removeReactInstanceEventListener(ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.isBridgelessMode) {
            ReactHost reactHost = getReactHost();
            Intrinsics.checkNotNull(reactHost, "null cannot be cast to non-null type com.facebook.react.runtime.ReactHostImpl");
            ((ReactHostImpl) reactHost).removeReactInstanceEventListener(listener);
            return;
        }
        getReactNativeHost().getReactInstanceManager().removeReactInstanceEventListener(listener);
    }

    public final void start() {
        if (this.isBridgelessMode) {
            ReactHost reactHost = getReactHost();
            Intrinsics.checkNotNull(reactHost, "null cannot be cast to non-null type com.facebook.react.runtime.ReactHostImpl");
            ((ReactHostImpl) reactHost).start();
            return;
        }
        getReactNativeHost().getReactInstanceManager().createReactContextInBackground();
    }

    public static /* synthetic */ void destroy$default(ReactHostWrapper reactHostWrapper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "DevLauncher reloading app";
        }
        reactHostWrapper.destroy(str);
    }

    public final void destroy(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.isBridgelessMode) {
            getReactHost().destroy(reason, null);
        } else {
            getReactNativeHost().clear();
        }
    }
}
