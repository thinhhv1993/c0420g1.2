package bai10.mapvstree.baitap;

import bai10.mapvstree.thuchanh.AbstractTree;
import bai10.mapvstree.thuchanh.TreeNode;

import java.util.Stack;

class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    @Override
    public int getSize() {
        return size;
    }

    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    public void deleteKey(E element) {
        root = deleteRec(root, element);
        size--;
    }
    /* Hàm đệ qui để xóa phần tử khỏi mảng */
    public TreeNode<E> deleteRec(TreeNode<E> root, E element) {
        /* trường hợp gốc : nếu node root null */
        if (root == null) {
            return root;
        }
        /* ngược lại chúng ta sẽ duyệt dọc cây  */
        if (element.compareTo(root.element)<0)
            root.left = deleteRec(root.left, element);
        else if (element.compareTo(root.element)>0)
            root.right = deleteRec(root.right, element);
            // nếu key có cùng giá trị với node key thì chính là node cần xóa
        else {
            // node không có hoặc chỉ có 1 node con
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // node có 2 node con.
            root.element = minValue(root.right);
            // Xóa phần từ nhỏ nhất bên phải
            root.right = deleteRec(root.right, root.element);
        }
        return root;
    }
    public E minValue(TreeNode<E> root) {
        E minv = root.element;
        while (root.left != null) {
            minv = root.left.element;
            root = root.left;
        }
        return (E) minv;
    }

    public boolean search(E e) {
        TreeNode<E> current = root;
        while (current!=null){
            if(e.compareTo(current.element)<0){
                current=current.left;
            }else if(e.compareTo(current.element)>0){
                current=current.right;
            }else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(55);
        tree.insert(57);
        tree.insert(59);
        tree.insert(45);
        tree.insert(60);
        tree.insert(67);
        tree.insert(100);
        tree.insert(101);
        tree.insert(107);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("");
        tree.postorder();
        System.out.println("");
        System.out.println(tree.search(50));
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}

