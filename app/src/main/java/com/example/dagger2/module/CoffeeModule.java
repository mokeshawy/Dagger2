package com.example.dagger2.module;

import com.example.dagger2.daggerclass.River;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @Provides
    River provideRiver(){
        return new River();
    }

    // we need add new function add @Provides
    //@Provides
//    River2 provideRiver(){
//        return new River();
//    }

}
