package com.example.dagger2.daggerclass;

import android.util.Log;

import com.example.dagger2.annotation.ActivityScope;

import javax.inject.Inject;
import javax.inject.Singleton;

 // when you need instance will get single instance by dagger.
@ActivityScope
public class Farm {

    @Inject
    public Farm(){
        Log.d("Farm", " mohamed Beans");
    }

    public String getBeans(){
        return "Beans";
    }
}
