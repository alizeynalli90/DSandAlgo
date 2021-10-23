package az.alizeynalli.dt.binarytree;

/*
+++pros cons+++
 store information that naturally forms a hierarchy
 moderate access/search (quicker than Linked List and slower than arrays).
 moderate insertion/deletion (quicker than Arrays and slower than Unordered Linked Lists).
Like Linked Lists and unlike Arrays, Trees don’t have an upper limit on number of nodes as nodes are linked using pointers.

+++properties+++
1) The maximum number of nodes at level ‘l’ of a binary tree is 2l.
2) The Maximum number of nodes in a binary tree of height ‘h’ is 2h – 1.
3) In a Binary Tree with N nodes, minimum possible height or the minimum number of levels is? Log2(N+1)
4) A Binary Tree with L leaves has at least | Log2L? |+ 1   levels
5) In Binary tree where every node has 0 or 2 children, the number of leaf nodes is always one more than nodes with two children.
+++types+++
Full Binary Tree A Binary Tree is a full binary tree if every node has 0 or 2 children.
Complete Binary Tree: A Binary Tree is a Complete Binary Tree if all the levels are
completely filled except possibly the last level and the last level has all keys as left as possible
Perfect Binary Tree A Binary tree is a Perfect Binary Tree in which all the internal nodes have
two children and all leaf nodes are at the same level.
* */
public class BinaryTree {
    private BTNode root;

    public BinaryTree(BTNode root) {
        this.root = root;
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    // left,root,right
    public void traverseInOrder(BTNode node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            System.out.println(node.getKey());
            traverseInOrder(node.getRight());
        }
    }

    // root,left,right
    public void traversePreOrder(BTNode node) {
        if (node != null) {
            System.out.println(node.getKey());
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    // left,right,root
    public void traversePostOrder(BTNode node) {
        if (node != null) {
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.println(node.getKey());
        }
    }
}
