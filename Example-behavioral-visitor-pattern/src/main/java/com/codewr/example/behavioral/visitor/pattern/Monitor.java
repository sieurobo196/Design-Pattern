package com.codewr.example.behavioral.visitor.pattern;

/**
 *
 * @author codewr
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
