package alexiddev.test.zumme.util;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by v.aleksandrenko on 23.09.2016.
 */

public class Util {

    public static void showSnackBar(View view, String text) {
        Snackbar.make(view, text, Snackbar.LENGTH_LONG).show();
    }
}
