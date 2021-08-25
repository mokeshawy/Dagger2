package com.example.dagger2.component;

import com.example.dagger2.annotation.Milk;
import com.example.dagger2.annotation.Sugar;
import com.example.dagger2.daggerclass.Coffee;
import com.example.dagger2.activits.MainActivity;
import com.example.dagger2.module.CoffeeModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

// @Component(modules = (CoffeeModule1.class ,CoffeeModule2.class , CoffeeModule3.class )) when we need add some module.
@Component(modules = CoffeeModule.class) // connect with module.
public interface CoffeeComponent {

    Coffee getCoffee();

    // create this where we need using data member from activity or fragment with Dagger
    void inject(MainActivity mainActivity);

    // create constants builder for dagger
    @Component.Builder
    interface Builder{ // this builder for component ----> @Component.Builder.

        @BindsInstance  // get instance from sugar.
        Builder sugar( @Sugar int sugar);

        @BindsInstance  // get instance from milk.
        Builder milk( @Milk int milk);

        CoffeeComponent build();
    }
}
