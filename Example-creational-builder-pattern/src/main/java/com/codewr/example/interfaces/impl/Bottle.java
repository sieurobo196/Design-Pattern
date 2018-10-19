package com.codewr.example.interfaces.impl;

import com.codewr.example.interfaces.Packing;

/**
 *
 * @author codewr
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
