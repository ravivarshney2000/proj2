package implementation;

import myinterface.Node;
import myinterface.QueueAdt;

public class MyQueue implements QueueAdt {
    private Node front;
    private Node rear;
    private int size;

    public MyQueue(){
        front=null;
        rear=null;
        size=0;
    }



    @Override
    public void enqueue(int e) {
        Node node=new Node(e);
        if (!isEmpty()){
            rear.setNext(node);
            rear=node;
        }

        else{
            front=rear=node;
        }
        size++;

    }

    @Override
    public Node dequeue() {
        Node r=null;
        if (!isEmpty()){
            r=new Node(front.getData());

            if (size==1){
                front=rear=null;
            }

            else{
                front=front.getNext();
            }
            size--;

        }
        return r;
    }

    @Override
    public Node peek() {
        Node r=null;
        if (!isEmpty()){
            r=new Node(front.getData());
        }
        return r;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }


    public void traverse(){
        Node t=front;
        System.out.print("FRONT-->");
        while (t!=null){
            System.out.print(" "+t.getData());
            t=t.getNext();
        }
        System.out.print(" <--REAR");

    }
}
