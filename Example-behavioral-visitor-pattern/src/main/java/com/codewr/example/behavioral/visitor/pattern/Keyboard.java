package com.codewr.example.behavioral.visitor.pattern;

/**
 *
 * @author codewr
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
