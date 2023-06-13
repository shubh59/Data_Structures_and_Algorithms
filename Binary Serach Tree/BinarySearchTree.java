public class BinarySearchTree {

    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.rigth = insertHelper(root.rigth, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.rigth);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.rigth, data);
        }
        return false;
    }

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " not found");
        }
    }

    private Node removeHelper(Node root, int data) {

        if (root == null) {
            return null;
        } else if (root.data < data) {
            root.left = removeHelper(root.left, data);
        } else if (root.data > data) {
            root.rigth = removeHelper(root.rigth, data);
        } else { // found the node
            if (root.left == null && root.rigth == null) {
                root = null;
            } else if (root.rigth != null) {
                root.data = successor(root);
                root.rigth = removeHelper(root.rigth, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }

        }
        return root;
    }

    private int successor(Node root) {
        root = root.rigth;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root) {
        root = root.left;
        while (root.rigth != null) {
            root = root.rigth;
        }
        return root.data;
    }
}
