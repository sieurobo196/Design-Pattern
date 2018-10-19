package com.codewr.example.creational.singleton.pattern;

/**
 *
 * @author codewr
 */
public class SingleOb {
    //create an object of SingleOb

    private static SingleOb instance = new SingleOb();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleOb() {
    }

    //Get the only object available
    public static SingleOb getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("App use Singleton Pattern!");
    }
}
