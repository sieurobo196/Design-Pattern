
package com.codewr.example.behavioral.pattern.observer;

/**
 *
 * @author codewr
 */
public class ConvertOctal extends Observer {

    public ConvertOctal(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getType()));
    }
}
