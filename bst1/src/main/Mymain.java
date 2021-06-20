package main;

import implementation.MyBST;

public class Mymain {
    public static void main(String[] args) {
        MyBST bst=new MyBST();
        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(10);
        bst.insert(35);
        bst.insert(45);

        bst.inOrder(bst.getRoot());

        System.out.println("");
        System.out.println(bst.heightOfTree(bst.getRoot()));
        System.out.println("");

        bst.delete(10);
        bst.inOrder(bst.getRoot());

    }
}
