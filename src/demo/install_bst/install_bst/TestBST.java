package java_collection_framework.install_bst;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> testBST = new BST<>();
        testBST.insert(60);
        testBST.insert(55);
        testBST.insert(100);
        testBST.insert(45);
        testBST.insert(57);
        testBST.insert(67);
        testBST.insert(107);
        testBST.insert(59);
        testBST.insert(101);
        System.out.println("Breath First (sorted): ");
        testBST.breathFirst();
        System.out.println();
        testBST.deleteNode(60);
        System.out.println();
        testBST.breathFirst();

        System.out.println("\nThe number of nodes is: " + testBST.getSize());
    }
}
