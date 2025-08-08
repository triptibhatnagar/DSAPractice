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
public class Preorder {
    // Acc L R
    static void pre_rec(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        list.add(root.data);
        pre_rec(root.left, list);
        pre_rec(root.right, list);
    }
    static List<Integer> pre_iter(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        if(root == null)
            return pre;
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        st.push(temp);
        while (!st.isEmpty()) {
            // access/pop
            temp = st.pop();
            // add in list
            pre.add(temp.data);
            // store right
            if(temp.right != null)
                st.push(temp.right);
            // store left
            if(temp.left != null)
                st.push(temp.left);
        }
        return pre;

        /*
            OR  
         * while (true) {
            if(st.isEmpty())
                break;


            .... rest all same ....
         */
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

        // List<Integer> pre = new ArrayList<>();
        // pre_rec(root, pre);
        // System.out.println(pre);
        System.out.println(pre_iter(root));
    }
}