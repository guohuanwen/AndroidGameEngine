package com.bcgtgjyb.engine.camera;

import android.graphics.Canvas;

import com.bcgtgjyb.engine.sprite.BaseSprite;

/**
 * Created by bigwen on 2016/6/28.
 */
public class BaseCamera {

    public void lookSprite(Canvas canvas,BaseSprite baseSprite){
        canvas.translate(-baseSprite.x,-baseSprite.y);
    }
}
