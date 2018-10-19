package com.codewr.example.abstracts.extds;

import com.codewr.example.abstracts.ColdDrink;

/**
 *
 * @author codewr
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
