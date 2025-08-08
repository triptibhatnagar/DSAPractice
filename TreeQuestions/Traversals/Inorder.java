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
    // L Acc R
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
            if(temp != null) {// not null => a new node
                st.push(temp);// store
                temp = temp.left;// go to its left
            } else {
                if (st.isEmpty()) {// check to avoid error while pop, also, breaks the loop, avoids infinite loop and error
                    break;
                }
                temp = st.pop();// access node / pop
                in.add(temp.data);// add in list
                temp = temp.right;// go to right
            }
        }
        return in;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        // TreeNode root = new TreeNode(1);
        // root.left = new TreeNode(4);
        // root.left.left = new TreeNode(4);
        // root.left.right = new TreeNode(2);
        // List<Integer> inorder = new ArrayList<>();
        // inorder_rec(root, inorder);
        // System.out.println(inorder);

        List<Integer> inorder = inorder_iter(root);
        System.out.println(inorder);
    }
}