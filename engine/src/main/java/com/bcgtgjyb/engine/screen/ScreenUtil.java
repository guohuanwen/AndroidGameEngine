package com.bcgtgjyb.engine.screen;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.bcgtgjyb.engine.EngineApplication;

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

    public static int getScreenHeight() {
        if(screenHeight != 0) return screenHeight;

        Display display =  ((WindowManager)EngineApplication.getInstance().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenHeight = size.y;
        return screenHeight;
    }

    public static int getScreenWidth() {
        if(screenHeight != 0) return screenHeight;

        Display display =  ((WindowManager)EngineApplication.getInstance().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        screenWidth = size.x;
        return screenWidth;
    }


}
