package implement;

public class Node
{
    private int data;
    private Node next;
    private Node pre;
    public Node(int data)
    {
        this.data=data;
        next=null;
        pre=null;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public Node getPre()
    {
        return pre;
    }

    public void setPre(Node pre)
    {
        this.pre = pre;
    }

}
