package com.example.dagger2.activits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import com.example.dagger2.component.DaggerCoffeeComponent;
import com.example.dagger2.daggerclass.Coffee;
import com.example.dagger2.R;
import com.example.dagger2.component.CoffeeComponent;
import com.example.dagger2.databinding.ActivityMainBinding;
import com.example.dagger2.module.CoffeeModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    private static final String TAG = "MainActivity";

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Generated by dagger. operation work dagger2 before add constructor in module.
        // CoffeeComponent component = DaggerCoffeeComponent.create();

        // Generated by dagger. operation work dagger2 after add constructor in module.
        //CoffeeComponent component = DaggerCoffeeComponent.builder().coffeeModule(new CoffeeModule(3)).build();

        // this Generate after add @component.builder
        CoffeeComponent component = DaggerCoffeeComponent.builder().sugar(4).milk(7).build();

        // work on inject function in activity.
        component.inject(this);
                                                                        // get coffee instance number.
        Log.d(TAG, "mohamed onCreate: "+ coffee.getCoffeeCup() +"Coffee no :"+coffee);
    }
}