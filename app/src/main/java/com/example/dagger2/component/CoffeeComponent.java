package com.example.dagger2.component;

import com.example.dagger2.annotation.ActivityScope;
import com.example.dagger2.annotation.Milk;
import com.example.dagger2.annotation.Sugar;
import com.example.dagger2.daggerclass.Coffee;
import com.example.dagger2.activits.MainActivity;
import com.example.dagger2.module.RiverModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

// @Component(modules = (CoffeeModule1.class ,CoffeeModule2.class , CoffeeModule3.class )) when we need add some module.

@ActivityScope // create custom Activity Singleton because when component dependent another component not allowed using same @Singleton
//@Component(dependencies = AppComponent.class) // connect with module. CoffeeComponent dependent on AppComponent.
@Subcomponent()
public interface CoffeeComponent {

    Coffee getCoffee();

    // create this where we need using data member from activity or fragment with Dagger
    void inject(MainActivity mainActivity);

    // create constants builder for dagger
    //@Component.Builder
    @Subcomponent.Builder
    interface Builder{ // this builder for component ----> @Component.Builder.

        @BindsInstance  // get instance from sugar.
        Builder sugar( @Sugar int sugar);

        @BindsInstance  // get instance from milk.
        Builder milk( @Milk int milk);

        //Builder appComponent(AppComponent appComponent); // get instance from appComponent.

        CoffeeComponent build();
    }
}
