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
public class Inorder {
    // inorder = left root right
    private static void recInorder(TreeNode root, List<Integer> nodes) {
        // base case
        if(root == null)
            return;
        recInorder(root.left, nodes);
        nodes.add(root.data);
        recInorder(root.right, nodes);
    }
    static List<Integer> iterInorder(TreeNode root) {
        // simulate recursion using stack
        Stack<TreeNode> st = new Stack<>();
        List<Integer> nodes = new ArrayList<>();
        TreeNode node = root;
        while (true) {
            if(node != null) {
                st.push(node);
                node = node.left;
            }else {
                if(st.isEmpty()) break;
                node = st.pop();
                nodes.add(node.data);
                node = node.right;
            }
        }
        return nodes;
    }
    static List<Integer> initiation(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        recInorder(root, nodes);
        return nodes;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);    
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        // List<Integer> nodes = initiation(root);
        // System.out.println(nodes);
        List<Integer> in = iterInorder(root);
        System.out.println(in);
    }
}