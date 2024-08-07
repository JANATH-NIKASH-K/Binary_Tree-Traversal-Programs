
class Tree {
    int value;
    Tree left, right;

    
    Tree(int item) {
        this.value = item;
        left = right = null;
    }
}


class Treetraversal {
    void preorder(Tree node) {
        if (node == null) 
            return;
        System.out.print(node.value + " ");  
        preorder(node.left);
        preorder(node.right);
    }
    void inorder(Tree node) {
        if (node == null) 
            return; 
        inorder(node.left);
        System.out.print(node.value + " "); 
        inorder(node.right);
    }
    void postorder(Tree node) {
        if (node == null) 
            return; 
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " "); 
    }


    public static void main(String[] args) {
        Tree root = new Tree(4);
        root.left = new Tree(2);
        root.right = new Tree(5);
        root.left.left = new Tree(3);
        root.left.left.right = new Tree(9);
        root.left.left.right.left = new Tree(1);
        root.right.left=new Tree(7);
        root.right.right=new Tree(6);
        root.right.right.left=new Tree(8);

        Treetraversal tree = new Treetraversal();
        System.out.println("Preorder traversal of binary tree:");
        tree.preorder(root);
        System.out.println("\nInorder traversal of binary tree:");
        tree.inorder(root);
        System.out.println("\nPostorder traversal of binary tree:");
        tree.postorder(root);
    }
}
