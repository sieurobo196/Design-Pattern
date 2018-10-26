package com.codewr.example.behavioral.visitor.pattern;

/**
 *
 * @author codewr
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
