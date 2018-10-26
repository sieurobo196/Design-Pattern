package com.codewr.example.behavioral.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codewr
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        // print string convert
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
