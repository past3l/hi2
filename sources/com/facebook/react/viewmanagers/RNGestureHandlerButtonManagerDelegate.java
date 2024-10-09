package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;

/* loaded from: classes.dex */
public class RNGestureHandlerButtonManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNGestureHandlerButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNGestureHandlerButtonManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2143114526:
                if (str.equals("rippleRadius")) {
                    c = 0;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals(ViewProps.ENABLED)) {
                    c = 1;
                    break;
                }
                break;
            case -775297261:
                if (str.equals("rippleColor")) {
                    c = 2;
                    break;
                }
                break;
            case 722830999:
                if (str.equals(ViewProps.BORDER_COLOR)) {
                    c = 3;
                    break;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c = 4;
                    break;
                }
                break;
            case 741115130:
                if (str.equals(ViewProps.BORDER_WIDTH)) {
                    c = 5;
                    break;
                }
                break;
            case 1387411372:
                if (str.equals("touchSoundDisabled")) {
                    c = 6;
                    break;
                }
                break;
            case 1686617758:
                if (str.equals("exclusive")) {
                    c = 7;
                    break;
                }
                break;
            case 1825644485:
                if (str.equals("borderless")) {
                    c = '\b';
                    break;
                }
                break;
            case 1984457027:
                if (str.equals("foreground")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setRippleRadius(t, obj != null ? ((Double) obj).intValue() : 0);
                return;
            case 1:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setEnabled(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case 2:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setRippleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderStyle(t, obj == null ? "solid" : (String) obj);
                return;
            case 5:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderWidth(t, obj == null ? 0.0f : ((Double) obj).floatValue());
                return;
            case 6:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setTouchSoundDisabled(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case 7:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setExclusive(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                return;
            case '\b':
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderless(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            case '\t':
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setForeground(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
