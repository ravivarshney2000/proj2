import implementation.QueueArray;

public class main {
    public static void main(String[] args) {
        QueueArray q=new QueueArray(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.traverse();
        q.dequeue();
        q.traverse();
        q.enqueue(4);
        q.peek();
        q.enqueue(5);
        q.enqueue(6);
        q.traverse();
        q.enqueue(7);
        q.dequeue();
        q.traverse();
    }
}
