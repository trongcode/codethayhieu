package tree;

public class IntTreeNode {

    public int data;
    public IntTreeNode left;
    public IntTreeNode right;

    public IntTreeNode(int data) {
        this(data, null, null);
    }

    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // Hàm thêm phần tử vào cây (Insert)
    public static IntTreeNode insert(IntTreeNode root, int data) {
        if (root == null) {
            return new IntTreeNode(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Hàm inorder traversal
    public static void inorderTraversal(IntTreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Hàm tìm node nhỏ nhất trong cây con phải
    public static IntTreeNode minValueNode(IntTreeNode root) {
        IntTreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Hàm xóa phần tử khỏi cây (Delete)
    public static IntTreeNode delete(IntTreeNode root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            // Node có 1 hoặc không có con
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node có 2 con
            IntTreeNode temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }

        return root;
    }

    public static void main(String[] args) {
        IntTreeNode root = new IntTreeNode(1);
        root = insert(root, 2);
        root = insert(root, 3);
        root = insert(root, 4);
        root = insert(root, 7);

        System.out.print("Before delete: ");
        inorderTraversal(root);
        System.out.println();

        // Xóa phần tử có giá trị 3
        root = delete(root, 3);

        System.out.print("Inorder Traversal after deleting 3: ");
        inorderTraversal(root);
    }
}
