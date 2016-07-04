package com.bcgtgjyb.engine.camera;

import android.graphics.Canvas;

import com.bcgtgjyb.engine.screen.ScreenUtil;
import com.bcgtgjyb.engine.sprite.BaseSprite;
import com.bcgtgjyb.engine.sprite.SnakeSprite;

/**
 * Created by bigwen on 2016/6/28.
 */
public class BaseCamera {

    public void lookSprite(Canvas canvas,BaseSprite baseSprite){
        canvas.translate(-baseSprite.x,-baseSprite.y);
    }

    public void lookSprite(Canvas canvas,SnakeSprite baseSprite){
        canvas.translate(-baseSprite.x+ ScreenUtil.getScreenWidth()/2,-baseSprite.y+ScreenUtil.getScreenHeight()/2);
    }
}
