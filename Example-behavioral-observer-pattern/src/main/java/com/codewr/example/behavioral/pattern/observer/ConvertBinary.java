package com.codewr.example.behavioral.pattern.observer;

/**
 *
 * @author codewr
 */
public class ConvertBinary extends Observer {

    public ConvertBinary(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getType()));
    }
}
