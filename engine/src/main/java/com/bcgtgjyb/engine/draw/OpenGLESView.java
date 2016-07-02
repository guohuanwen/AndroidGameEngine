package com.bcgtgjyb.engine.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by bigwen on 2016/6/28.
 */
public class OpenGLESView extends GLSurfaceView {

    public OpenGLESView(Context context) {
        super(context);
    }

    public OpenGLESView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }
}
