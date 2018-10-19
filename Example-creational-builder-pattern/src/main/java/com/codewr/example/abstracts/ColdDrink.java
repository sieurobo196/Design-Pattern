package com.codewr.example.abstracts;

import com.codewr.example.interfaces.impl.Bottle;
import com.codewr.example.interfaces.Packing;
import com.codewr.example.interfaces.Item;

/**
 *
 * @author codewr
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        Packing packing = new Bottle();
        return packing;
    }

    @Override
    public abstract float price();
}
