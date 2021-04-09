package myinterface;

import implementation.Node;

public interface MySLinkList {

    boolean addFirst(int element);
    boolean addLast(int element);
    Node first();
    int removeFirst();
    int removeLast();
    int size();
    boolean isEmpty();
}
