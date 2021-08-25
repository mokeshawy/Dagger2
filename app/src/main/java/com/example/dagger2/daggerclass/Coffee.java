package com.example.dagger2.daggerclass;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
    Farm farm;      // field injection.
    @Inject
    River river;

    @Inject
    public Coffee(){ // constructor injection.

    }

    @Inject // methods inject.
    public void connectElectricity(){
        Log.d(TAG," mohamed connectElectricity connect....");
    }
    public String getCoffeeCup(){
        return farm.getBeans() + "+" + river.getWater();
    }
}
