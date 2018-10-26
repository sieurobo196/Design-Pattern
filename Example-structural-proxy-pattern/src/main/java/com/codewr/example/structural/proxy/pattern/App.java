package com.codewr.example.structural.proxy.pattern;

/**
 *
 * @author codewr
 */
public class App {

    public static void main(String[] args) {
        Image image = new ProxyImage("messi.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");
        //image will not be loaded from disk
        image.display();
    }
}
