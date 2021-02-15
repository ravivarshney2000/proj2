package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {

    private final int MAX_CAPACITY;//max size
    private int[] arr;//arr for storing elements in stack
    private int top;//every stack has a top


    //constructor
    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        //initialize arr
        arr = new int[MAX_CAPACITY];
        //top is -1 or 0
        //for top is -1
        top=-1;
    }

    @Override
    public void push(int e) {
        if (isEmpty()){
            top++;
            arr[top]=e;
            System.out.println("Element Added To Stack");
        }
        else {
            System.out.println("Stack Overflow");
        }
    }

    @Override
    public int pop() {
        int r=0;
        if(top>=0 && top<MAX_CAPACITY-1){//if(top!=-1)
            r=arr[top];
            top--;
            return r;
        }
        else {
            System.out.println("Stack Is Empty");
            return r;
        }
    }

    @Override
    public int peek() {
        if(top>=0 && top<MAX_CAPACITY-1){//if(top!=-1)
            return arr[top];
        }
        else {
            System.out.println("Stack Is Empty");
            return 0;//considering zero as invalid data
        }
    }

    @Override
    public boolean isEmpty() {
        if (top < MAX_CAPACITY-1){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return top+1;
    }

    public boolean search(int searchKey){
        boolean r=false;
        for (int i = 0; i <= top; i++) {
            if (searchKey==arr[i]) {
                r = true;
                break;
            }
        }
        return r;
    }

    public void traverse(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
