import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Preorder {
    // pre = root left right
    static void recPreorder(TreeNode root, List<Integer> nodes) {
        // base case
        if(root == null) {
            return;
        }
        nodes.add(root.data);
        recPreorder(root.left, nodes);
        recPreorder(root.right, nodes);
    }
    static List<Integer> initiation(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        recPreorder(root, nodes);
        return nodes;
    }

    // iterative
    static List<Integer> iterPreorder(TreeNode root) {
        // preorder = root left right
        List<Integer> nodes = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) {
            return nodes;
        }
        TreeNode node = root;
        st.push(root);
        while (!st.isEmpty()) {
            node = st.pop();
            nodes.add(node.data);
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
        return nodes;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        // List<Integer> nodes = initiation(root);
        // System.out.println(nodes);
        List<Integer> nodes = iterPreorder(root);
        System.out.println(nodes);
    }
}