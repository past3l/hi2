package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DebuggingOverlayManagerInterface;

/* loaded from: classes.dex */
public class DebuggingOverlayManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DebuggingOverlayManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DebuggingOverlayManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        super.setProperty(t, str, obj);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1942063165:
                if (str.equals("clearElementsHighlights")) {
                    c = 0;
                    break;
                }
                break;
            case 1326903961:
                if (str.equals("highlightTraceUpdates")) {
                    c = 1;
                    break;
                }
                break;
            case 1385348555:
                if (str.equals("highlightElements")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((DebuggingOverlayManagerInterface) this.mViewManager).clearElementsHighlights(t);
                return;
            case 1:
                ((DebuggingOverlayManagerInterface) this.mViewManager).highlightTraceUpdates(t, readableArray.getArray(0));
                return;
            case 2:
                ((DebuggingOverlayManagerInterface) this.mViewManager).highlightElements(t, readableArray.getArray(0));
                return;
            default:
                return;
        }
    }
}
