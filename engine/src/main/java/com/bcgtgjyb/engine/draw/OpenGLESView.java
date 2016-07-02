package com.bcgtgjyb.engine.draw;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.bcgtgjyb.engine.R;
import com.bcgtgjyb.engine.sprite.MoveSprite;
import com.bcgtgjyb.engine.texture.BaseTexture;

/**
 * Created by bigwen on 2016/6/28.
 */
public class OpenGLESView extends View {

    private Context mContext;
    private MoveSprite sprite;
    private String TAG = OpenGLESView.class.getSimpleName();

    public OpenGLESView(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public OpenGLESView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    private void init() {
        Log.i(TAG, "init: ");
        sprite = new MoveSprite();
        BaseTexture texture = new BaseTexture();
        texture.bitmap = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.ic_launcher);
        texture.paint = new Paint();
        texture.rect = new Rect(0,0,200,200);
        texture.paint.setColor(Color.parseColor("#333333"));
        texture.text = "guohuanwen";

        sprite.texture = texture;
        sprite.rectF = new RectF(100,100,500,500);

        initThread();
    }

    private void initThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    Log.i(TAG, "run: refresh");




                    try {
                        Thread.sleep(16);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    postInvalidate();
                }
            }
        }).start();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        sprite.draw(canvas);
    }

    public void setDegree(float degree){
        sprite.degree = degree;
    }
}
