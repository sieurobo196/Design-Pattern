package com.codewr.example.creational.prototype.pattern;

/**
 *
 * @author codewr
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Draw a rectangle !");
    }
}
