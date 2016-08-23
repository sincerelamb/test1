package com.sjty.test1application;

/**
 * Created by SJTY_YX on 2016/8/23.
 */
import android.app.Application;

import org.xutils.x;

public class Application1 extends Application {
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true); //是否输出debug日志，开启debug会影响性能。
    }
}
