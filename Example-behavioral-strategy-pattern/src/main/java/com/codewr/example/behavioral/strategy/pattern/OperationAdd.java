package com.codewr.example.behavioral.strategy.pattern;

/**
 *
 * @author codewr
 */
public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
}