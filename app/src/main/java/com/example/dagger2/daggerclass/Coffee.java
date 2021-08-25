package com.example.dagger2.daggerclass;

import android.util.Log;

import com.example.dagger2.annotation.Milk;
import com.example.dagger2.annotation.Sugar;

import javax.inject.Inject;
import javax.inject.Named;

public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
    Farm farm;      // field injection.

    River river; // constructor injection.

    int sugar;

    int milk;

    @Inject
    public Coffee(River river , @Sugar int sugar , @Milk int milk){ // constructor injection.
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Inject // methods inject.
    public void connectElectricity(){
        Log.d(TAG," mohamed connectElectricity connect....");
    }
    public String getCoffeeCup(){
        return farm.getBeans() + "+" + river.getWater() + "+" + sugar + "+" + milk;
    }
}
