package com.example.test.uncatchexception;

import android.content.Context;
import android.os.Process;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/23.
 */

public class CrashHandler implements Thread.UncaughtExceptionHandler{
    private final static  String TAG = "CrashHandler";
    private static CrashHandler instance = new CrashHandler();
    private Thread.UncaughtExceptionHandler mUncaughtExceptionHandler;
    private  static Context Scontext;
    private CrashHandler(){

    };

    public static CrashHandler getInstance(){
        return  instance;
    }

    public void init(Context context){
        mUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        Scontext = context;
    }
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        Log.e(TAG,throwable.toString());
        if(mUncaughtExceptionHandler != null){
            mUncaughtExceptionHandler.uncaughtException(thread,throwable);
        }else {
            Process.killProcess(Process.myPid());
        }
    }
}
