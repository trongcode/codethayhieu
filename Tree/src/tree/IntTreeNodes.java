package tree;

public class IntTreeNodes {

    public int data;
    public IntTreeNodes left;
    public IntTreeNodes right;

    public IntTreeNodes(int data) {
        this(data, null, null);
    }

    public IntTreeNodes(int data, IntTreeNodes left, IntTreeNodes right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
