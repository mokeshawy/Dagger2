package com.example.dagger2;

import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();
}
