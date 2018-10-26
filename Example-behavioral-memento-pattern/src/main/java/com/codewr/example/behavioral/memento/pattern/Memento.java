package com.codewr.example.behavioral.memento.pattern;

/**
 *
 * @author codewr
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
