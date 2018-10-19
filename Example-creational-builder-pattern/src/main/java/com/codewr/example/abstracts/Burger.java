package com.codewr.example.abstracts;

import com.codewr.example.interfaces.impl.Wrapper;
import com.codewr.example.interfaces.Packing;
import com.codewr.example.interfaces.Item;

/**
 *
 * @author codewr
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        Packing packing = new Wrapper();
        return packing;
    }

    @Override
    public abstract float price();
}
