package com.example.test.uncatchexception;

import android.app.Application;
import android.content.pm.ApplicationInfo;

/**
 * Created by Administrator on 2017/3/23.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
    }
}
