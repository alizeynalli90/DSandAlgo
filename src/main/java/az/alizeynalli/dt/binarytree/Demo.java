package az.alizeynalli.dt.binarytree;

public class Demo {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(new BTNode(1));
        BTNode second = new BTNode(2);
        BTNode third = new BTNode(3);
        BTNode fourth = new BTNode(4);
        BTNode fifth = new BTNode(5);
        BTNode sixth = new BTNode(6);
        tree.getRoot().setLeft(second);
        tree.getRoot().setRight(third);
        second.setLeft(fourth);
        second.setRight(fifth);
        fourth.setLeft(sixth);
        System.out.println("+++inorder+++");
        tree.traverseInOrder(tree.getRoot());
        System.out.println("+++preorder+++");
        tree.traversePreOrder(tree.getRoot());
        System.out.println("+++postorder+++");
        tree.traversePostOrder(tree.getRoot());

        System.out.println("+++BST+++");
        BinarySearchTree bst = new BinarySearchTree(new BTNode(6));
        bst.add(new BTNode(4));
        bst.add(new BTNode(8));
        bst.add(new BTNode(3));
        bst.add(new BTNode(5));
        bst.add(new BTNode(7));
        bst.add(new BTNode(9));
        System.out.println("+++inorder+++");
        bst.traverseInOrder(bst.getRoot());
        System.out.println("+++preorder+++");
        bst.traversePreOrder(bst.getRoot());
        System.out.println("+++postorder+++");
        bst.traversePostOrder(bst.getRoot());
        System.out.println(bst.search(new BTNode(4)));
        bst.delete(new BTNode(4));
        bst.traversePostOrder(bst.getRoot());
    }
}
