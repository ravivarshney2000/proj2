package main;

import infix.postfix.InfixToPostfix;

public class MyMain {
    public static void main(String[] args) {
        String infixString="A^B^f-C^d^e";
        InfixToPostfix convertor = new InfixToPostfix();
        String postfix=convertor.infixToPOstfix(infixString);
        System.out.println("INFIX   ="+infixString);
        System.out.println("POSTFIX ="+postfix);
    }
}
