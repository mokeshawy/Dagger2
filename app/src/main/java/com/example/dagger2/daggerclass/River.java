package com.example.dagger2.daggerclass;

import javax.inject.Inject;

public class River {

    @Inject
    public River(){

    }

    public String getWater(){
        return "Water";
    }
}
