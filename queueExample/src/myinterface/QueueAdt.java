package myinterface;

public interface QueueAdt {
    void enqueue(int e);
    Node dequeue();
    Node peek();
    boolean isEmpty();
    int size();
}
