package expo.modules.core;

import android.content.Context;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.SingletonModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ModuleRegistryProvider {
    private List<Package> mPackages;

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Package> getPackages() {
        return this.mPackages;
    }

    public ModuleRegistryProvider(List<Package> list) {
        this.mPackages = list;
    }

    public ModuleRegistry get(Context context) {
        return new ModuleRegistry(createInternalModules(context), createSingletonModules(context));
    }

    public Collection<InternalModule> createInternalModules(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<Package> it = getPackages().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().createInternalModules(context));
        }
        return arrayList;
    }

    public Collection<SingletonModule> createSingletonModules(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<Package> it = getPackages().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().createSingletonModules(context));
        }
        return arrayList;
    }
}
