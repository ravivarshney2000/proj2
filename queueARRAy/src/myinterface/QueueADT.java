package myinterface;

public interface QueueADT {
    void enqueue(int data);
    void dequeue();
    void peek();
    boolean isEmpty();
    int size();
}
