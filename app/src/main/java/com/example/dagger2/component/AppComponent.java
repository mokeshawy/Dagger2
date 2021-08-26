package com.example.dagger2.component;

import com.example.dagger2.daggerclass.River;
import com.example.dagger2.module.RiverModule;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent { // AppComponent dependency for CoffeeComponent.

    River getRiver();

}
