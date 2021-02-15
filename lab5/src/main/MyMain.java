package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        int maxcapacity=5;
        MyStack stack=new MyStack(maxcapacity);
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Element at top/PEEK="+stack.peek());
        stack.push(50);
        stack.push(60);
        System.out.println("No of Elements in Stack="+stack.size());
        stack.traverse();
        System.out.println();
        System.out.println("Searching Element 60 found="+stack.search(60));
        System.out.println("Searching Element 40 found="+stack.search(40));
    }
}
