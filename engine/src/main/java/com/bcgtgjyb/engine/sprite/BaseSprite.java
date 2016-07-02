package com.bcgtgjyb.engine.sprite;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

import com.bcgtgjyb.engine.texture.BaseTexture;

/**
 * Created by bigwen on 2016/6/28.
 */
public abstract class BaseSprite {
    //类型
    public int type;
    //是否死亡
    public boolean isAlive;
    //是否碰撞
    public boolean isCollidable;
    //是否可见
    public boolean isVisible;
    //纹理
    public BaseTexture texture;
    //宽高，坐标
    public int width,heightx,x,y;
    //绘制区域
    public RectF rectF;
    //画笔
    public Paint paint;

    protected abstract void draw(Canvas canvas);

}
