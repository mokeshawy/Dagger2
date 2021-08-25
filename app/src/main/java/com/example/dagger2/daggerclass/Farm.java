package com.example.dagger2.daggerclass;

import javax.inject.Inject;

public class Farm {

    @Inject
    public Farm(){

    }

    public String getBeans(){

        return "Beans";
    }
}
