package com.bcgtgjyb.engine.sprite;

import android.graphics.Canvas;
import android.util.Log;

/**
 * Created by bigwen on 2016/6/28.
 */
public class MoveSprite extends BaseSprite {

    private String TAG = MoveSprite.class.getSimpleName();
    //自动移动
    public boolean isAutoMove;
    //移动方向
    public float degree = 0.4f;
    //速度
    public int velovity = 2;
    //上一次刷新的时间
    public long lastTime;

    private float[] transition = new float[2];

    @Override
    public void draw(Canvas canvas) {
        Log.i(TAG, "draw: x="+x+"   y="+y);
        move();
        texture.drawBitmap(canvas,rectF);
        texture.drawText(canvas,(int)x,(int)y);
    }

    private void autoMove(){

    }

    private void move(){
        transitionXY();
        x = x + transition[0];
        y = y + transition[1];
        rectF.left = rectF.left + transition[0];
        rectF.top = rectF.top + transition[1];
        rectF.right = rectF.right + transition[0];
        rectF.bottom = rectF.bottom +  transition[1];
    }

    private void checkVisible(){

    }

    private void transitionXY(){
        transition[0] = (float) (Math.cos(degree)*velovity);
        transition[1] = (float) (Math.sin(degree)*velovity);
    }
}
