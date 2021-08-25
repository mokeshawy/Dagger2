package com.example.dagger2.daggerclass;

import android.util.Log;

import javax.inject.Inject;

public class Farm {

    @Inject
    public Farm(){
        Log.d("Farm", " mohamed Beans");
    }

    public String getBeans(){

        return "Beans";
    }
}
