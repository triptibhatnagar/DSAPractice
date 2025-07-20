import java.util.ArrayList;
import java.util.List;

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
    static List<Integer> initiation(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        recInorder(root, nodes);
        return nodes;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);    
        root.left = new TreeNode(4);
        // root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        List<Integer> nodes = initiation(root);
        System.out.println(nodes);
    }
}
