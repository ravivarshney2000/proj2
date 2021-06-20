package implementation;

import node.Node;

public class MyBST {
    private Node root;

    //TO GET ROOT OF THE TREE
    public Node getRoot() {
        return root;
    }

    //INSERTING
    public void insert(int data){
        Node node=new Node(data);
        if (root==null){
            root=node;
        }
        else{
            Node temp=root;
            Node parent=null;
            while (temp!=null){
                 parent=temp;
                if (data<=temp.getData()){
                    temp=temp.getLeft();
                }
                else {
                    temp=temp.getRight();
                }
            }
            if (data<= parent.getData()){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

    //TRAVERSE IN INORDER
    public void inOrder(Node node){
        if (node==null){
            return;
        }
        else {
            inOrder(node.getLeft());
            System.out.print(node.getData()+",");
            inOrder(node.getRight());
        }
    }

    //SERACHING
    public boolean search(int element){
        boolean response=false;
        Node temp=root;
        while (temp!=null){
            if (temp.getData()==element){
                response=true;
                break;
            }
            else {
                if (element< temp.getData()){
                    temp=temp.getLeft();
                }
                else {
                    temp=temp.getRight();
                }
            }
        }
        return response;
    }


    //DELETEING LEAF
    public void delete(int element){

        Node temp=root;
        Node parent =null;

        while (temp!=null && temp.getData()!=element){
            parent=temp;
            if (element< temp.getData()){
                temp=temp.getLeft();
            }
            else {
                temp=temp.getRight();
            }
        }

        //CASE 1:LEAF
        if (temp!=null) {
            if (isLeaf(temp)) {
                if (element < parent.getData()) {
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            }

            //CASE 2: ONE CHILD
            else if (temp.getLeft() != null && temp.getRight() == null) {
                if (temp.getData() <= parent.getData()) {
                    parent.setLeft(temp.getLeft());
                } else {
                    parent.setRight(temp.getLeft());
                }

            } else if (temp.getRight() != null && temp.getLeft() == null) {
                if (temp.getData() <= parent.getData()) {
                    parent.setLeft(temp.getRight());
                } else {
                    parent.setRight(temp.getRight());
                }

            }

            //CASE 3: TWO CHILD
            else {
                Node successor=getSuccessor(temp);
                //delete successor
                delete(successor.getData());
                //assigning child of temp to successor
                successor.setLeft(temp.getLeft());
                successor.setRight(temp.getRight());

                //changing parent ref to successor
                if (temp.getData()<= parent.getData()){
                    parent.setLeft(successor);
                }
                else{
                    parent.setRight(successor);
                }
            }


        }

        else {
            System.out.println("CANNOT DELETE ELEMENT NOT PRESENT");
        }
    }


    //SUCCESSOR
    private Node getSuccessor(Node temp){
        Node response=null;
        temp=temp.getRight();
        while (temp!=null){
            response=temp;
            temp=temp.getLeft();
        }
        return response;
    }



    //ISLEAF
    private boolean isLeaf(Node temp) {
        if (temp.getLeft()==null){
            if (temp.getRight()==null){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    //HEIGHT
    public int heightOfTree(Node node){
        if (node==null){
            return -1;
        }
        else {
            return 1+Math.max(heightOfTree(node.getLeft()),heightOfTree(node.getRight()));
        }
    }


}
