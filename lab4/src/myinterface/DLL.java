package myinterface;

public interface DLL
{
    void addFirst(int e);//O(1)-Complexity
    void addLast(int e);//O(1)
    boolean isEmpty();//O(1)
    int size();
    int first();
    int last();
    void traverse();//O(N)
    int removeFirst();//O(1)
    int removeLast();//O(1)
    boolean search(int e);
}
