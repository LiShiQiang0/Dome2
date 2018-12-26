package com.example.dome;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "da5e6381f9", true);
    }
}
