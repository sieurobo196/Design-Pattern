package com.codewr.example.creational.prototype.pattern;

/**
 *
 * @author codewr
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw a square !");
    }
}
