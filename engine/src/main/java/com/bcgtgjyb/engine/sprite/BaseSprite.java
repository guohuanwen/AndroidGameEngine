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
    public boolean isAlive = true;
    //是否碰撞
    public boolean isCollidable = true;
    //是否可见
    public boolean isVisible = true;
    //纹理
    public BaseTexture texture;
    //宽高，坐标
    public float width=100,heightx=100,x = 100,y=100;
    //绘制区域
    public RectF rectF;
    //画笔
    public Paint paint;

    public abstract void draw(Canvas canvas);

    //碰撞回调
    public interface Callback{
        void collidable(int type1,int tpye2);
    }
}
