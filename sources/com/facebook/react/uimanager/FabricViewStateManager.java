package com.facebook.react.uimanager;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

@Deprecated(forRemoval = true, since = "Deprecated class since v0.73.0, please use com.facebook.react.uimanager.StateWrapper instead.")
/* loaded from: classes.dex */
public class FabricViewStateManager {
    private static final String TAG = "FabricViewStateManager";
    private StateWrapper mStateWrapper = null;

    @Deprecated
    /* loaded from: classes.dex */
    public interface HasFabricViewStateManager {
        FabricViewStateManager getFabricViewStateManager();
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface StateUpdateCallback {
        WritableMap getStateUpdate();
    }

    @Deprecated
    public boolean hasStateWrapper() {
        return this.mStateWrapper != null;
    }

    @Deprecated
    public void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }

    private void setState(StateWrapper stateWrapper, StateUpdateCallback stateUpdateCallback, int i) {
        WritableMap stateUpdate;
        if (stateWrapper == null) {
            FLog.e(TAG, "setState called without a StateWrapper");
        } else if (stateWrapper == this.mStateWrapper && i <= 60 && (stateUpdate = stateUpdateCallback.getStateUpdate()) != null) {
            stateWrapper.updateState(stateUpdate);
        }
    }

    @Deprecated
    public void setState(StateUpdateCallback stateUpdateCallback) {
        setState(this.mStateWrapper, stateUpdateCallback, 0);
    }

    @Deprecated
    public ReadableMap getStateData() {
        StateWrapper stateWrapper = this.mStateWrapper;
        if (stateWrapper != null) {
            return stateWrapper.getStateData();
        }
        return null;
    }
}
