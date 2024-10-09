package expo.modules.devlauncher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import expo.modules.devlauncher.R;

/* loaded from: classes3.dex */
public final class ErrorConsoleFragmentBinding implements ViewBinding {
    public final ImageButton consoleHomeButton;
    public final ImageButton consoleReloadButton;
    public final ListView listView;
    private final LinearLayout rootView;

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    private ErrorConsoleFragmentBinding(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, ListView listView) {
        this.rootView = linearLayout;
        this.consoleHomeButton = imageButton;
        this.consoleReloadButton = imageButton2;
        this.listView = listView;
    }

    public static ErrorConsoleFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ErrorConsoleFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.error_console_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ErrorConsoleFragmentBinding bind(View view) {
        int i = R.id.console_home_button;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.console_reload_button;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
            if (imageButton2 != null) {
                i = R.id.list_view;
                ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
                if (listView != null) {
                    return new ErrorConsoleFragmentBinding((LinearLayout) view, imageButton, imageButton2, listView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
