package implementation;

import myinterface.QueueADT;

public class QueueArray implements QueueADT {
    int front,rear,capacity,size=0;
    int qarr[];
    public QueueArray(int c){
        front=rear=0;
        capacity=c;
        qarr=new int[capacity];
    }

    @Override
    public void enqueue(int data) {
        if(capacity==rear){
            System.out.println();
            System.out.println("QUEUE OVERFLOW");
        }
        else{
            qarr[rear]=data;
            rear++;
            size++;
        }
    }

    @Override
    public void dequeue() {
        System.out.println("");
        if (rear==front){
            System.out.println("QUEUE UNDERFLOW");
        }

        else{System.out.println("DELETED->"+qarr[0]);
            for (int i = 0; i < size-1; i++) {
                qarr[i]=qarr[i+1];
            }
            if (rear<capacity){

                qarr[rear]=0;
            }
            rear--;
            size--;
        }

    }

    @Override
    public void peek() {
        if (rear==front){
            System.out.println("QUEUE IS EMPTY");
        }
        else{
            System.out.println();
            System.out.println("PEEK-->"+qarr[0]);
            }

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
        if (front==rear){
            System.out.println("QUEUE IS EMPTY");
        }
        else{
            System.out.print("Front-->");
            for (int i = 0; i < size; i++) {
                System.out.print(" "+qarr[i]);
            }
            System.out.print("<--REAR");
        }
    }
}
