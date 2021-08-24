package com.example.dagger2;

import dagger.Component;

@Component
public interface CoffeeComponent {

    Coffee getCoffee();

    // create this where we need using data member from activity or fragment with Dagger
    void inject(MainActivity mainActivity);
}
