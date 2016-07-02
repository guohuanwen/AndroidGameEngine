package com.bcgtgjyb.engine.screen;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by bigwen on 2016/7/2.
 */
public class ScreenUtil {
    //多屏幕适配
    //16:9
    private static int screenHeight = 0,screenWidth = 0;

    public static int getScreenHeight(Context context) {
        if (screenHeight == 0) {
            DisplayMetrics dm = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(dm);
            screenHeight = dm.heightPixels;
        }
        return screenHeight;
    }

    public static int getScreenWidth(Context context) {
        if (screenWidth == 0) {
            DisplayMetrics dm = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(dm);
            screenWidth = dm.widthPixels;
        }
        return screenWidth;
    }
}
