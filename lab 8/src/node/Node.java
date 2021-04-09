package node;
public class Node<E extends Comparable<E>> implements Comparable<E>{
    private E data;
    private Node<E> lc;
    private Node<E> rc;

    public Node(E data){
        this.data=data;
        lc=null;
        rc=null;
    }

    public Node(){

    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLc() {
        return lc;
    }

    public void setLc(Node<E> lc) {
        this.lc = lc;
    }

    public Node<E> getRc() {
        return rc;
    }

    public void setRc(Node<E> rc) {
        this.rc = rc;
    }

    @Override
    public int compareTo(E o) {
        return 0;
    }
}
