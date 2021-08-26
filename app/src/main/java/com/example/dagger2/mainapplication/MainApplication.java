package com.example.dagger2.mainapplication;

import android.app.Application;

import com.example.dagger2.component.AppComponent;
import com.example.dagger2.component.DaggerAppComponent;

public class MainApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // this Generate after add appComponent
        appComponent = DaggerAppComponent.create();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
