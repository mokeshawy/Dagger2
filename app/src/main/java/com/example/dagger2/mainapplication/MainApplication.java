package com.example.dagger2.mainapplication;

import android.app.Application;

import com.example.dagger2.component.CoffeeComponent;
import com.example.dagger2.component.DaggerCoffeeComponent;

public class MainApplication extends Application {

    private CoffeeComponent coffeeComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // this Generate after add @component.builder
        coffeeComponent = DaggerCoffeeComponent.builder().sugar(4).milk(7).build();

    }

    public CoffeeComponent getCoffeeComponent() {
        return coffeeComponent;
    }
}
