package com.codewr.example;

/**
 *
 * @author codewr
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
