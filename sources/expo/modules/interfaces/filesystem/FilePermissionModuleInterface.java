package expo.modules.interfaces.filesystem;

import android.content.Context;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public interface FilePermissionModuleInterface {
    EnumSet<Permission> getPathPermissions(Context context, String str);
}
