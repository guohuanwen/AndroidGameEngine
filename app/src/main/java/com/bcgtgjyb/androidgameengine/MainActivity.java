package com.bcgtgjyb.androidgameengine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bcgtgjyb.engine.control.TouchHandler;
import com.bcgtgjyb.engine.draw.OpenGLESView;

public class MainActivity extends AppCompatActivity {

    private OpenGLESView mainView;
    private TouchHandler touch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainView = (OpenGLESView) findViewById(R.id.main_view);
        touch = (TouchHandler) findViewById(R.id.touch);

        touch.setCallback(new TouchHandler.Callback() {
            @Override
            public void onChange(float degree) {
                mainView.setDegree(degree);
            }
        });

    }
}
