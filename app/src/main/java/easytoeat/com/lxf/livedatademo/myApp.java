package easytoeat.com.lxf.livedatademo;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * LiveDataDemo
 * easytoeat.com.lxf.livedatademo
 * Created by Kyrie
 * Created on 2018/8/13.
 */

public class myApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
    /**
     * 分包
     *
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
