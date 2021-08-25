package com.example.dagger2.daggerclass;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton // when you need instance will get single instance by dagger.
public class Farm {

    @Inject
    public Farm(){
        Log.d("Farm", " mohamed Beans");
    }

    public String getBeans(){

        return "Beans";
    }
}
