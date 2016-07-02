package com.bcgtgjyb.engine.map;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

/**
 * Created by bigwen on 2016/6/28.
 */
public class BaseMap {
    //左上角为原点   (px)
    public int width = 10000, height =10000;
    private RectF rectF = new RectF();
    private int w, h;

    public void draw(Canvas canvas, Bitmap bitmap) {
        int rate = 1;
        if (bitmap.getWidth() < width) {
            rate = width / bitmap.getWidth();
        }
        w = bitmap.getWidth();
        h = bitmap.getHeight();
        for (int i = 0; i < rate; i++) {
            for (int j = 0; j < rate; j++) {
                rectF.left = w * i;
                rectF.top = h * j;
                rectF.right = w * (i + 1);
                rectF.bottom = h * (j + 1);
                canvas.drawBitmap(bitmap, null, rectF, null);
            }
        }

    }
}
