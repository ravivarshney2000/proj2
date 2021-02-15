package implement;

import myinterface.DLL;

public class MDLL implements DLL
{
    private Node head;
    private Node tail;
    private int size;

    //constructor
    public MDLL()
    {
        head=null;
        tail=null;
        size=0;
    }

    @Override
    public void addFirst(int e)
    {
        Node node = new Node(e);//by calling a class constructor
        if (isEmpty())
        {
            head=node;
            tail=node;
        }
        else
        {
            node.setNext(head);
            head.setPre(node);
            head=node;
        }
        size++;
    }

    @Override
    public void addLast(int e)
    {
        Node node=new Node(e);
        if (isEmpty())
        {
            head=node;
            tail=node;
        }
        else
        {
            node.setPre(tail);
            tail.setNext(node);
            tail=node;
        }
        size++;
    }

    @Override
    public boolean isEmpty()
    {
        return head==null;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public int first()
    {
        if (!isEmpty())
        {
            return head.getData();
        }
        else
        {
            return 0;//considering 0 as invalid data
        }
    }

    @Override
    public int last()
    {
        if (!isEmpty())
        {
            return tail.getData();
        }
        else
        {
            return 0;//considering 0 as invalid data
        }
    }

    @Override
    public void traverse()
    {

    }

    @Override
    public int removeFirst()
    {
        return 0;
    }

    @Override
    public int removeLast()
    {
        return 0;
    }

    @Override
    public boolean search(int e) {
        return false;
    }
}
