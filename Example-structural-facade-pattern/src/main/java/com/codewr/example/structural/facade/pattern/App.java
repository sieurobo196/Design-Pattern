package com.codewr.example.structural.facade.pattern;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
