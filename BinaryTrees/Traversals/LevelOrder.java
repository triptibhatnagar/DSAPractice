import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    static List<List<Integer>> levelwise(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) {
            return list;
        }
        q.add(root);
        TreeNode node = root;
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                node = q.remove();
                level.add(node.data);
                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
            }
            list.add(level);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        List<List<Integer>> levelList = levelwise(root);
        for(List<Integer> x: levelList) {
            System.out.println(x);
        }
    }
}
/**
 * pre, in, post = dfs based
 * level order = bfs based
 */