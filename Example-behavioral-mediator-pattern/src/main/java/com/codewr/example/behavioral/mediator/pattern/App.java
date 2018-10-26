
package com.codewr.example.behavioral.mediator.pattern;

/**
 *
 * @author codewr
 */
public class App {
    public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}
