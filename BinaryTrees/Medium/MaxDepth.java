import java.util.LinkedList;
import java.util.Queue;

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
public class MaxDepth {
    static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode node = root;
        int cnt = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                node = q.remove();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.println(maxDepth(root));
    }
}
