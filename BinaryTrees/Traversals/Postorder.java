import java.util.ArrayList;
import java.util.Collections;
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
public class Postorder {
    // postorder = left right root
    static void recPostorder(TreeNode root, List<Integer> nodes) {
        if(root == null) 
            return;
        recPostorder(root.left, nodes);
        recPostorder(root.right, nodes);
        nodes.add(root.data);
    }
    static List<Integer> initiation(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        recPostorder(root, nodes);
        return nodes;
    }

    // iterative
    static List<Integer> iterPostorder(TreeNode root) {
        // postorder = left right root
        // reverse = root right left
        List<Integer> nodes = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root != null)
            st.push(root);
        TreeNode node = root;
        while (!st.isEmpty()) {
            node = st.pop();
            nodes.add(node.data);
            if (node.left != null) {
                st.push(node.left);
            }
            if (node.right != null) {
                st.push(node.right);
            }
        }
        Collections.reverse(nodes);
        return nodes;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(initiation(root));
        System.out.println(iterPostorder(root));
    }
}
