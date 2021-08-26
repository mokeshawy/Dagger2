package com.example.dagger2.module;

import com.example.dagger2.daggerclass.River;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

    //int sugar;

//    public CoffeeModule( int sugar){ // constructor... for coffeeModule.
//        this.sugar = sugar;
//    }

    @Singleton
    @Provides
    River provideRiver(){
        return new River();
    }

    // we need add more function add @Provides
//    @Provides
//    int provideSugar(){
//        return sugar;
//    }

}
