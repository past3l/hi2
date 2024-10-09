package expo.modules;

import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.asset.AssetModule;
import expo.modules.constants.ConstantsModule;
import expo.modules.constants.ConstantsPackage;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.Package;
import expo.modules.crypto.CryptoModule;
import expo.modules.devlauncher.DevLauncherPackage;
import expo.modules.devmenu.DevMenuPackage;
import expo.modules.devmenu.modules.DevMenuModule;
import expo.modules.devmenu.modules.DevMenuPreferences;
import expo.modules.filesystem.FileSystemModule;
import expo.modules.filesystem.FileSystemPackage;
import expo.modules.font.FontLoaderModule;
import expo.modules.keepawake.KeepAwakeModule;
import expo.modules.keepawake.KeepAwakePackage;
import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.modules.Module;
import expo.modules.splashscreen.SplashScreenModule;
import expo.modules.splashscreen.SplashScreenPackage;
import expo.modules.systemui.SystemUIModule;
import expo.modules.systemui.SystemUIPackage;
import expo.modules.webbrowser.WebBrowserModule;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class ExpoModulesPackageList implements ModulesProvider {

    /* loaded from: classes3.dex */
    private static class LazyHolder {
        static final List<Package> packagesList = Arrays.asList(new ReactAdapterPackage(), new ConstantsPackage(), new BasePackage(), new DevLauncherPackage(), new DevMenuPackage(), new FileSystemPackage(), new KeepAwakePackage(), new SplashScreenPackage(), new SystemUIPackage());
        static final List<Class<? extends Module>> modulesList = Arrays.asList(AssetModule.class, ConstantsModule.class, CryptoModule.class, DevMenuModule.class, DevMenuPreferences.class, FileSystemModule.class, FontLoaderModule.class, KeepAwakeModule.class, SplashScreenModule.class, SystemUIModule.class, WebBrowserModule.class);

        private LazyHolder() {
        }
    }

    public static List<Package> getPackageList() {
        return LazyHolder.packagesList;
    }

    @Override // expo.modules.kotlin.ModulesProvider
    public List<Class<? extends Module>> getModulesList() {
        return LazyHolder.modulesList;
    }
}
