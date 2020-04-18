package ru.geekbrains.meteo_app;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public final class MakeLog {
    private static final String LIFECYCLE = "LIFE_CYCLE";
    private static final String CLICK = "CLICK";

    public static void click(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        Log.d(CLICK, msg);
    }

    public static void lifeCycle(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        Log.d(LIFECYCLE, msg);
    }

}
