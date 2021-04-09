package implementation;

import myinterface.MySLinkList;

public class MyLL implements MySLinkList {
    private Node head;
    private Node tail;
    private int size;


    public MyLL(){
        head=null;
        tail=null;
        size=0;
    }

    @Override
    public boolean addFirst(int element){
        boolean response=false;
        Node node=new Node(element);
        if (head==null){
            head=node;
            tail=node;
            size++;
            response=true;
        }
        else {
            node.setNext(head);
            head = node;
            size++;
            response=true;
        }
        return response;
    }

    @Override
    public boolean addLast(int element) {
        Node node=new Node(element);
        boolean response=false;
        if (isEmpty()){
            head=node;
            tail=node;
            size++;
            response=true;

        }
        else{
            tail.setNext(node);
            tail=node;
            size++;
            response=true;

        }
        return response;
    }

    @Override
    public Node first() {
        Node node=head;
        return node;
    }

    @Override
    public int removeFirst() {
        return 0;
    }

    @Override
    public int removeLast() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }


    @Override
    public boolean isEmpty() {
        if (head==null){
            return true;
        }
        else {
            return false;
        }
    }

    public void traverse(){
        if (head!=null){
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(temp.getData()+" ");
                temp=temp.getNext();
            }
        }
        System.out.println();
    }

    public void PrintSLLInReverse(Node n){
        //Node n=head;
        if(n==null){
            return;
        }

        else{
            PrintSLLInReverse(n.getNext());
            System.out.print(n.getData()+" ");
        }
    }
}
