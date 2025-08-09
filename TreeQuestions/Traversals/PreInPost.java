import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class NodeState {
    TreeNode node;
    int state;
    NodeState(TreeNode node, int state) {
        this.node = node;
        this.state = state;
    }
}

public class PreInPost {
    static List<List<Integer>> preInPost(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if(root == null) {
            return Arrays.asList(pre, in, post);
        }
        Stack<NodeState> st = new Stack<>();
        st.push(new NodeState(root, 1));
        while (!st.isEmpty()) {
            NodeState ns = st.pop();
            TreeNode node = ns.node;
            int state = ns.state;
            if(state == 1) {
                pre.add(node.data);
                st.push(new NodeState(node, state+1));
                if (node.left != null) {
                    st.push(new NodeState(node.left, 1));
                }
            }else if(state == 2) {
                in.add(node.data);
                st.push(new NodeState(node, state+1));
                if (node.right != null) {
                    st.push(new NodeState(node.right, 1));
                }
            }else if(state == 3) {
                post.add(node.data);
            }
        }
        return Arrays.asList(pre, in, post);
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

        for(List<Integer> x: preInPost(root)) {
            System.out.println(x);
        }
    }
}