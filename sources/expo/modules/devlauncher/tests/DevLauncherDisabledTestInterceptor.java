package expo.modules.devlauncher.tests;

import kotlin.Metadata;

/* compiled from: DevLauncherDisabledTestInterceptor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lexpo/modules/devlauncher/tests/DevLauncherDisabledTestInterceptor;", "Lexpo/modules/devlauncher/tests/DevLauncherTestInterceptor;", "()V", "allowReinitialization", "", "expo-dev-launcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DevLauncherDisabledTestInterceptor implements DevLauncherTestInterceptor {
    @Override // expo.modules.devlauncher.tests.DevLauncherTestInterceptor
    public boolean allowReinitialization() {
        return false;
    }
}
