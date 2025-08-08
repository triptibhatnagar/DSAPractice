import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Postorder {
    static void post_rec(TreeNode root, List<Integer> post) {
        // L R Acc
        if(root == null)
            return;
        post_rec(root.left, post);
        post_rec(root.right, post);
        post.add(root.data);
    }
    static List<Integer> post_iter(TreeNode root) {
        // L R Acc
        // but Acc R L
        // coz, dont know when to access, so nodes are adding up, not pooping, so st will not get empty. maybe infinite loop occurs
        List<Integer> post = new ArrayList<>();
        if(root == null)
            return post;
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        st.push(temp);
        while (true) {
            if(st.isEmpty())
                break;
            // access / pop
            temp = st.pop();
            // add in list
            post.add(temp.data);
            // add left
            if(temp.left != null)
                st.push(temp.left);
            // add right
            if (temp.right != null) {
                st.push(temp.right);
            }
        }
        Collections.reverse(post);
        return post;
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

        // List<Integer> post = new ArrayList<>();
        // post_rec(root, post);
        // System.out.println(post);

        System.out.println(post_iter(root));
    }
}
