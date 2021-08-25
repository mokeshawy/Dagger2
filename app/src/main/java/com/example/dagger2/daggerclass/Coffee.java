package com.example.dagger2.daggerclass;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
    Farm farm;      // field injection.

    River river; // constructor injection.

    int sugar;

    @Inject
    public Coffee(River river , int sugar){ // constructor injection.
        this.river = river;

        this.sugar = sugar;
    }

    @Inject // methods inject.
    public void connectElectricity(){
        Log.d(TAG," mohamed connectElectricity connect....");
    }
    public String getCoffeeCup(){
        return farm.getBeans() + "+" + river.getWater() + "+" + sugar;
    }
}
