package com.bcgtgjyb.engine.texture;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/**
 * Created by bigwen on 2016/6/28.
 */
public class BaseTexture {
    //三个可选项
    public Bitmap bitmap;
    public int drawableRes;
    public String text;
    //纹理大小(必选实现)
    public Rect rect;
    //画笔(必选实现)
    public Paint paint;

    public void drawBitmap(Canvas canvas, RectF rectF){
        if (bitmap != null){
            canvas.drawBitmap(bitmap,rect,rectF,paint);
        }
    }

    public void drawText(Canvas canvas,int x,int y){
        if (text != null){
            canvas.drawText(text,x,y,paint);
        }
    }
}
