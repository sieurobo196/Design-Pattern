package com.codewr.example.behavioral.visitor.pattern;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
