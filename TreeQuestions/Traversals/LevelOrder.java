import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> trav = new ArrayList<>();
        if(root == null)
            return trav;
        TreeNode temp = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(temp);
        while (true) {
            if(q.isEmpty())
                break;
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++) {
                temp = q.remove();
                level.add(temp.data);
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
            trav.add(level);
        }
        return trav;
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

        for(List<Integer> x: levelOrderTraversal(root)) {
            System.out.println(x);
        }
    }
}
