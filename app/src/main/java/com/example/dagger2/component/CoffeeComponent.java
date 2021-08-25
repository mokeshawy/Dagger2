package com.example.dagger2.component;

import com.example.dagger2.daggerclass.Coffee;
import com.example.dagger2.activits.MainActivity;

import dagger.Component;

@Component
public interface CoffeeComponent {

    Coffee getCoffee();

    // create this where we need using data member from activity or fragment with Dagger
    void inject(MainActivity mainActivity);
}
