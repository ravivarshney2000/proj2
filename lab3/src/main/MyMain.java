package main;
import implementation.MyLL;
public class MyMain {
    public static void main(String[] args) {
        MyLL singlyLinkedList=new MyLL();
        int element=10;
        boolean result=singlyLinkedList.addFirst(element);
        System.out.println(result);
        result = singlyLinkedList.addLast(20);
        System.out.println(result);
        result = singlyLinkedList.addLast(30);
        System.out.println(result);
        result = singlyLinkedList.addLast(40);
        System.out.println(result);
        result = singlyLinkedList.addLast(50);
        System.out.println(result);
        singlyLinkedList.traverse();
        singlyLinkedList.PrintSLLInReverse(singlyLinkedList.first());
    }
}
