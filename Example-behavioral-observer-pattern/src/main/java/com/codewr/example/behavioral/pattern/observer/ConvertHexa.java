package com.codewr.example.behavioral.pattern.observer;

/**
 *
 * @author codewr
 */
public class ConvertHexa extends Observer {

    public ConvertHexa(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getType()).toUpperCase());
    }
}
