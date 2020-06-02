package com.mfy.weixin;

import android.app.Application;

import com.mfy.weixin_annotations.WXPayEntry;

@WXPayEntry(packageName = "com.mfy.weixin",entryClass = BaseApplication.class)
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
