package com.example.dagger2;

import javax.inject.Inject;

public class Coffee {

    private Farm farm;
    private River river;

    @Inject
    public Coffee( Farm farm , River river){
        this.farm = farm;
        this.river = river;
    }
}
