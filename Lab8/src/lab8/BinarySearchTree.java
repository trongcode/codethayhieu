/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8;
class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRecursive(root, key);
    }

    Node insertRecursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRecursive(root.left, key);
        else if (key > root.key)
            root.right = insertRecursive(root.right, key);

        return root;
    }

    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.key + " ");
            inOrderTraversal(node.right);
        }
    }

    boolean search(int key) {
        return searchRecursive(root, key);
    }

    boolean searchRecursive(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return searchRecursive(root.left, key);
        else
            return searchRecursive(root.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Thêm các phần tử vào cây
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);

        // In ra phạm vi các giá trị sau khi duyệt cây theo thứ tự giữa
        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        // Tìm kiếm giá trị 4 và in ra kết quả
        boolean found = tree.search(5);
        System.out.println("\nSearch 5: " + found);
    }
}
