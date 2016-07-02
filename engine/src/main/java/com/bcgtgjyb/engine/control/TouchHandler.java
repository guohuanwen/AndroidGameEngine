package com.bcgtgjyb.engine.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by bigwen on 2016/7/2.
 */
public class TouchHandler extends View {

    private Paint paint;
    private Context mContext;
    private int[] xy = new int[2];
    private int circleR = 200;
    private float degree = 0;
    private float pi = 3.14f;
    private Callback callback;

    public TouchHandler(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public TouchHandler(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public void init() {
        paint = new Paint();
        paint.setColor(Color.parseColor("#50000000"));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/2,paint);
        canvas.drawCircle(xy[0],xy[1],circleR,paint);
    }


    float x,y;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getRawX();
        y = event.getRawY();
        xy[0] = (int) (x + getX());
        xy[1] = (int) (y + getY());
        int action = event.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                degree = caculateDegree(xy);
                if (callback != null){
                    callback.onChange(degree);
                }
                postInvalidate();
                break;
            case MotionEvent.ACTION_UP:
                xy[0] = getWidth()/2;
                xy[1] = getHeight()/2;
                break;
        }
        return true;

    }

    /**
     * 通过坐标计算角度
     */
    private float caculateDegree(int[] coordinate){
        return (float) Math.atan2((coordinate[1] - getHeight()/2),(coordinate[0] - getWidth()/2));
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public interface Callback{
        void onChange(float degree);
    }
}
