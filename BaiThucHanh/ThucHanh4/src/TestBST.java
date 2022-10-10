public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("hieu");
        tree.insert("tiep");
        tree.insert("minh");
        tree.insert("van");
        tree.insert("thanh");
        tree.insert("hung");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: "+ tree.getSize());
    }
}
