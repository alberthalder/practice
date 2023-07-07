package java_practice_june;

public class BinarySearchTree {





public void insert(int value) {
    Node root = insert(root, value);
}

private Node insert(Node node, int value) {
    if (node == null) {
        node = new Node(value);
    } else if (value < node.value) {
        node.left = insert(node.left, value);
    } else if (value > node.value) {
        node.right = insert(node.right, value);
    }
    return node;
}

public void inorder() {
    Node root = null;
	inorder(root);
}

private void inorder(Node node) {
    if (node != null) {
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
}

public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    tree.inorder();
}
}