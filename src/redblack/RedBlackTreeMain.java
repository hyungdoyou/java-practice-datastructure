package redblack;

public class RedBlackTreeMain {
    public static void main(String[] args) {

        RedBlackTree rbt = new RedBlackTree();

        rbt.add(20);
        rbt.add(30);
        rbt.add(40);
        rbt.add(50);
        rbt.add(60);
        TreePrinter.print(rbt.root);
    }
}