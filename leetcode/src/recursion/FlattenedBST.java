package recursion;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
public class FlattenedBST {
    private static void helper(Node res, Node root) {
        if (root == null) return;
        if (root.left != null) {
            res.right = new Node(root.left.data);
            helper(res.right, root.left);
        }
        root.right = new Node(res.data);

        if (root.right == null) {
            res.right = new Node(res.right.data);
            helper(res, root.left);
        }
    }

    public static Node flattenBST(Node root) {
        Node res = new Node(-1);
        helper(res, root);
        return res.right;
    }

    public static void main(String[] args) {

    }
}