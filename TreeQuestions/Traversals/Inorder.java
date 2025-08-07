import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }
    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class Inorder {
    // left access right
    static void inorder_rec(TreeNode root, List<Integer> in) {
        if(root == null) 
            return;
        inorder_rec(root.left, in);
        in.add(root.data);
        inorder_rec(root.right, in);
    }
    static List<Integer> inorder_iter(TreeNode root) {
        TreeNode temp = root;
        List<Integer> in = new ArrayList<>();
        // simulate recursion
        Stack<TreeNode> st = new Stack<>();
        while (true) {
            if(temp != null) {
                // left
                st.push(temp);
                temp = temp.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                temp = st.pop();
                in.add(temp.data);
                temp = temp.right;
            }
        }
        return in;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        // List<Integer> inorder = new ArrayList<>();
        // inorder_rec(root, inorder);
        // System.out.println(inorder);

        List<Integer> inorder = inorder_iter(root);
        System.out.println(inorder);
        
    }
}