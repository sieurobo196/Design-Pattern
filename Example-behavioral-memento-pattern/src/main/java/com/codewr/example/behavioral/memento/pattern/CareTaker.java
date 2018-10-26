package com.codewr.example.behavioral.memento.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author codewr
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
