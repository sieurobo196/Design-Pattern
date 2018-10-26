package com.codewr.example.behavioral.pattern.observer;

/**
 *
 * @author codewr
 */
public class App {
    public static void main(String[] args) {
      Subject subject = new Subject();

      new ConvertHexa(subject);
      new ConvertOctal(subject);
      new ConvertBinary(subject);

      System.out.println("Convert : 12");	
      subject.setType(12);
      System.out.println("Convert : 9");	
      subject.setType(9);
   }
}
