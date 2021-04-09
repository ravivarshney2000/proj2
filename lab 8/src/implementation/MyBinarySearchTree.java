package implementation;

import node.Node;

public class MyBinarySearchTree<E extends Comparable<E>> {
    private Node<E> root;

    public void insert(E data){
        Node<E> node=new Node<>(data);
        //isEmpty
        if(root==null){
            root=node;
        }
        else {
            Node<E> temp = root;
            Node<E> pre=null;
            while (temp!=null){
                pre=temp;
                if (data.compareTo(temp.getData()) <= 0){
                    temp=temp.getLc();
                }
                else {
                    temp=temp.getRc();
                }
            }
            //previous is the node whose child is data
            if (data.compareTo(pre.getData()) <= 0){
                pre.setLc(node);
            }
            else {
                pre.setRc(node);
            }
        }
    }


    //recursive
    public void insert(Node<E> node,Node<E> pre,E data){
        if (node==null){
            if (pre!=null){
                if (data.compareTo(pre.getData())<=0) {
                    pre.setRc(new Node<>(data));
                }
            }
            else {
                root = new Node<>(data);
            }
        }
        else if(data.compareTo(node.getData())<=0){
            insert(node.getLc(),node,data);
        }
        else {
            insert(node.getRc(),node,data);
        }

    }

    public void inOrderTraversal(Node<E> node){
        if (node==null){
            return;
        }

        else {
            inOrderTraversal(node.getLc());
            System.out.println(node.getData());
            inOrderTraversal(node.getRc());
        }
    }

    public Node<E> getRoot() {
        return getRoot() ;
    }
}
