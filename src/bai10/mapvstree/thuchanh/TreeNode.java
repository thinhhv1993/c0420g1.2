package bai10.mapvstree.thuchanh;

public class TreeNode<E> {
    public E element;
    public TreeNode<E> left;
    public TreeNode<E> right;

    public TreeNode(E e) {
        this.element = e;
    }
}
