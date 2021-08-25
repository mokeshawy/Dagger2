package com.example.dagger2.component;

import com.example.dagger2.daggerclass.Coffee;
import com.example.dagger2.activits.MainActivity;
import com.example.dagger2.module.CoffeeModule;

import dagger.Component;

// @Component(modules = (CoffeeModule1.class ,CoffeeModule2.class , CoffeeModule3.class )) when we need add some module.
@Component(modules = CoffeeModule.class) // connect with module.
public interface CoffeeComponent {

    Coffee getCoffee();

    // create this where we need using data member from activity or fragment with Dagger
    void inject(MainActivity mainActivity);
}
