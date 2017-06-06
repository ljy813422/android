package com.xiaobai.map.app;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by lijingyin on 2017/6/4.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());

    }
}
