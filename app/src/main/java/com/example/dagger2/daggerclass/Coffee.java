package com.example.dagger2.daggerclass;

import android.util.Log;

import com.example.dagger2.annotation.ActivityScope;
import com.example.dagger2.annotation.Milk;
import com.example.dagger2.annotation.Sugar;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope // because when one Activity we need Single instance from Coffee class.
public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
   public Farm farm;      // field injection.

   public River river; // constructor injection.

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
