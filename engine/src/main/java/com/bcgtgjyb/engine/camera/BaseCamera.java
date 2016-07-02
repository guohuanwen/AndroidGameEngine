package com.bcgtgjyb.engine.camera;

import android.graphics.Canvas;
import android.graphics.RectF;

import com.bcgtgjyb.engine.sprite.BaseSprite;

/**
 * Created by bigwen on 2016/6/28.
 */
public class BaseCamera {
    //四角的 地图坐标
    public RectF leftTop,rightTop,leftBottom,rightBottom;

    public void moveSprite(Canvas canvas,BaseSprite baseSprite){
        canvas.translate(baseSprite.x,baseSprite.y);
    }
}
