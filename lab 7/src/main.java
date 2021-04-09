import implementation.PQueue;

public class main {
    public static void main(String[] args) {
        PQueue q=new PQueue(5);
        q.enqueue(1);
        q.enqueue(8);
        q.enqueue(3);
        q.enqueue(10);
        q.enqueue(5);
        q.traverse();
    }
}
