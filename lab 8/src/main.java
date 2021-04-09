import implementation.MyBinarySearchTree;

public class main {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst=new MyBinarySearchTree<>();
        bst.insert(50);
        bst.insert(60);
        bst.insert(40);
        bst.inOrderTraversal(bst.getRoot());
    }
}
