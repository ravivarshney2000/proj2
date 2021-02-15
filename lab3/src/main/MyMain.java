package main;
import implementation.MyLL;
public class MyMain {
    public static void main(String[] args) {
        MyLL singlyLinkedList=new MyLL();
        int element=10;
        boolean result=singlyLinkedList.addFirst(element);
        System.out.println(result);
        result = singlyLinkedList.addLast(element);
        System.out.println(result);
    }
}
