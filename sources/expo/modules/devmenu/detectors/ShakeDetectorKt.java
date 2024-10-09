package expo.modules.devmenu.detectors;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: ShakeDetector.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"MIN_TIME_AFTER_SHAKE_NS", "", "REQUIRED_FORCE", "", "expo-dev-menu_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShakeDetectorKt {
    private static final long MIN_TIME_AFTER_SHAKE_NS = TimeUnit.NANOSECONDS.convert(600, TimeUnit.MILLISECONDS);
    private static final float REQUIRED_FORCE = 13.042845f;
}
