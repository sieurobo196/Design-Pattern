package com.codewr.example.structural.bridge.pattern;

/**
 *
 * @author codewr
 */
public class Blue implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle with color: blue, radius: " + radius + ", x: " + x + ", y: " + y);
    }

}
