package com.bcgtgjyb.engine;

import android.app.Application;

/**
 * Created by bigwen on 2016/7/3.
 */
public class EngineApplication extends Application {

    private static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static Application getInstance(){
        return application;
    }
}
