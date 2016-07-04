package com.bcgtgjyb.engine.sprite;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bigwen on 2016/7/3.
 */
public class SnakeSprite{

    public List<Point> points = new ArrayList<Point>();
    public List<Point> pointsLast = new ArrayList<Point>();
    //自动移动
    public boolean isAutoMove;
    //移动方向
    public float degree = 0.4f;
    //速度
    public int velovity = 3;

    public int x,y;

    private Point point = new Point(0,0);

    private int BODYR = 30;

    private int bodyspace = 30;

    private Paint paint;
    private int[] transport = new int[2];



    public SnakeSprite() {
        initBody();
        paint = new Paint();
        paint.setColor(Color.parseColor("#FF4081"));
    }

    public void draw(Canvas canvas) {
        refreshBody();
        for (Point point:points){
            canvas.drawCircle(point.x,point.y,BODYR,paint);
        }
    }

    private void initBody(){
        for (int i=0;i<5;i++){
            Point point = new Point();
            point.x = (i+1)*bodyspace;
            point.y = (i+1)*bodyspace;
            points.add(point);
            pointsLast.add(point);
        }
    }

    int[] t = new int[2];
    int refrsh = 0;
    private void refreshBody(){
        if (refrsh >= bodyspace/velovity){
            refrsh = 0;
            pointsLast.clear();
            pointsLast.addAll(points);
        }
        for (int i =0;i<points.size();i++){
            if (i == points.size()-1){

            }else {
                transitionXY(points.get(i+1),pointsLast.get(i),t,refrsh,bodyspace/velovity);
                points.get(i + 1).x = points.get(i + 1).x + t[0];
                points.get(i + 1).y = points.get(i + 1).y + t[1];
            }
        }
        transitionXY();
        points.get(0).x = point.x;
        points.get(0).y = point.y;
        x = point.x;
        y = point.y;
        refrsh ++;
    }

    private void transitionXY(){
        transport[0] = (int) (Math.cos(degree)*velovity);
        transport[1] = (int) (Math.sin(degree)*velovity);
        point.x = point.x +transport[0];
        point.y = point.y + transport[1];
    }

    private float caculateDegree(Point point,Point point0){
        return (float)Math.atan2(point.y-point0.y,point.x-point0.x);
    }

    private void transitionXY(float degree,int[] transport){
        transport[0] = (int) (Math.cos(degree)*velovity);
        transport[1] = (int) (Math.sin(degree)*velovity);
    }

    private void transitionXY(Point p,Point p2,int[] transport,int i,int all){
        transport[0] = (p2.x - p.x)*i/all;
        transport[1] = (p2.y - p.y)*i/all;
    }

}
