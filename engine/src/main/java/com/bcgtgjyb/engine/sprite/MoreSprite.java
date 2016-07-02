package com.bcgtgjyb.engine.sprite;

import android.graphics.Canvas;

/**
 * Created by bigwen on 2016/6/28.
 */
public class MoreSprite extends BaseSprite {

    //自动移动
    public boolean isAutoMove;
    //移动方向
    public int degree;
    //速度(每秒的距离)
    public int velovity;
    //上一次刷新的时间
    public long lastTime;



    @Override
    protected void draw(Canvas canvas) {

    }

    private void autoMove(){

    }

    private void move(){
        x = x + velovity;
        y = y + velovity;
        rectF.left = rectF.left + velovity;
        rectF.top = rectF.top + velovity;
        rectF.right = rectF.right + velovity;
        rectF.bottom = rectF.bottom +  velovity;
    }

    private void checkVisible(){

    }

}
