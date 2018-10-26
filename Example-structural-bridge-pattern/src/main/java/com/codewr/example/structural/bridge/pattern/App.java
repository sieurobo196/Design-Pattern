package com.codewr.example.structural.bridge.pattern;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new Red());
        Shape greenCircle = new Circle(100, 100, 10, new Green());
        Shape blueCircle = new Circle(100, 100, 10, new Blue());

        redCircle.draw();
        greenCircle.draw();
        blueCircle.draw();
    }
}
