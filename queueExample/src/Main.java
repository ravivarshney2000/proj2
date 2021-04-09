import implementation.MyQueue;
import myinterface.Node;

public class Main {
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.traverse();

        System.out.println("");

        System.out.println("deleted->"+q.dequeue().getData());
        System.out.println("size->"+q.size());

        Node a=q.peek();
        System.out.println(a.getData());
        q.traverse();
    }
}
