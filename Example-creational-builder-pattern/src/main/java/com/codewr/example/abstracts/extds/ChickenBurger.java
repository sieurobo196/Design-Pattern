package com.codewr.example.abstracts.extds;

import com.codewr.example.abstracts.Burger;

/**
 *
 * @author codewr
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
