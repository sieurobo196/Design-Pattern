package com.codewr.example;

/**
 *
 * @author codewr
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
