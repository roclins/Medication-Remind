package com.example.medicationremind;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

public class MyApplication extends LitePalApplication {
private static Context context;

@Override
public void onCreate(){
        super.onCreate();
        LitePal.initialize(this);
        }
        }
