package tree;

public class BinaryTree {
    private IntTreeNode root;

    // Hàm thêm phần tử vào cây (Insert)
    public void insert(int data) {
        root = insert(root, data);
    }

    private IntTreeNode insert(IntTreeNode node, int data) {
        if (node == null) {
            return new IntTreeNode(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    // Hàm inorder traversal
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(IntTreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Hàm xóa phần tử khỏi cây (Delete)
    public void delete(int data) {
        root = delete(root, data);
    }

    private IntTreeNode delete(IntTreeNode node, int data) {
        if (node == null) {
            return node;
        }

        if (data < node.data) {
            node.left = delete(node.left, data);
        } else if (data > node.data) {
            node.right = delete(node.right, data);
        } else {
            // Node có 1 hoặc không có con
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            // Node có 2 con
            IntTreeNode temp = minValueNode(node.right);
            node.data = temp.data;
            node.right = delete(node.right, temp.data);
        }

        return node;
    }

    // Hàm tìm node nhỏ nhất trong cây con phải
    private IntTreeNode minValueNode(IntTreeNode node) {
        IntTreeNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        // Thêm các phần tử vào cây
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(7);

        System.out.print("Before delete: ");
        tree.inorderTraversal();
        System.out.println();

        // Xóa phần tử có giá trị 3
        tree.delete(3);

        System.out.print("Inorder Traversal after deleting 3: ");
        tree.inorderTraversal();
    }
}
