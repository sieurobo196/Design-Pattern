package com.codewr.example.creational.singleton.pattern;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {

        SingleOb object = SingleOb.getInstance();

        //show the message
        object.showMessage();
    }
}
