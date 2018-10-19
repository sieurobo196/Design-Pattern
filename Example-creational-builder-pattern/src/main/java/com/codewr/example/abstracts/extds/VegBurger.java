package com.codewr.example.abstracts.extds;

import com.codewr.example.abstracts.Burger;

/**
 *
 * @author codewr
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }

}
