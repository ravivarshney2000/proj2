package implementation;

public class LL {
    private int size;
    private Node start;
    public LL() {
        size=0;
        start=null;

    }

    public boolean isEmpty(){
        return start==null;
    }

    public int getListsize(){
        return size;
    }

    public void viewList(){
        Node t;
        if(isEmpty())
            System.out.println("List is Empty");
        else{
            t=start;
            for (int i = 0; i < size; i++) {
                System.out.print(" "+t.getData());
                t=t.getNext();
            }
            System.out.println();
        }
    }

    public void addFirst(int val){
        Node n;
        n=new Node();
        n.setData(val);
        n.setNext(start);
        start=n;
        size++;
    }

    public void addLast(int val){
        Node n,t;
        n=new Node();
        n.setData(val);
        t=start;
        if(t==null)
            start=n;
        else {
            while (t.getNext() != null)
                t = t.getNext();
            t.setNext(n);
        }
        size++;
    }


    public void addBetween(int val,int pos){
        if(pos==1)
            addFirst(val);
        else if (pos==size+1)
            addLast(val);
        else if (pos>1&&pos<=size){
            Node n,t;
            n=new Node(val,null);
            t=start;
            for (int i = 1; i < pos-1; i++) {
                t=t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
        else
            System.out.println("Insertion not possible");
    }

    public void deleteFirst(){
        if(start==null)
            System.out.println("LL is empty");
        else{
            start=start.getNext();
            size--;
        }
    }

    public void deleteLast(){
        if(start==null)
            System.out.println("LL is empty");
        else if(size==1){
            start=null;
            size--;
        }
        else{
            Node t;
            t=start;
            for (int i = 1; i < size-1; i++) {
                t=t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }

    public void deleteBetween(int pos){
        if (start==null)
            System.out.println("LL is empty");
        else if (pos<1||pos>size)
            System.out.println("Invalid Position");
        else if (pos==1)
            deleteFirst();
        else if (pos==size)
            deleteLast();
        else{
            Node t,t1;
            t=start;
            for (int i = 1; i < pos-1; i++) {
                t=t.getNext();
            }
            t1=t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }
}
