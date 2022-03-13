package com.a.dongga;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class MyApplication extends Application {

    private AppOpenAdManager appOpenAdManager;

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this);

        appOpenAdManager = new AppOpenAdManager
                .Builder(this, AppOpenAdManager.AD_UNIT_ID)
                .setShowAdAutomatically(true)
                .build();
    }

    public AppOpenAdManager getAppOpenAdManager() {
        return this.appOpenAdManager;
    }
}
