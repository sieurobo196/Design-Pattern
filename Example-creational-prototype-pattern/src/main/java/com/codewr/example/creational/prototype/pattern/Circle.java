package com.codewr.example.creational.prototype.pattern;

/**
 *
 * @author codewr
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle !");
    }
}
