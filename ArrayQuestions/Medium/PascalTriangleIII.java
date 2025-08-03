import java.util.ArrayList;
import java.util.List;

public class PascalTriangleIII {
    static List<Integer> generateRow(int n) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int ans = 1;
        for(int i=1; i<n; i++) {
            ans *= n-i;
            ans /= i;
            row.add(ans);
        }
        return row;
    }
    static List<List<Integer>> pascalTrianglIII(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            List<Integer> row = generateRow(i);
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        for(List<Integer> x: pascalTrianglIII(n)) {
            System.out.println(x);
        }
    }
}