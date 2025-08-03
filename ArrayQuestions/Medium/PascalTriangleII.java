import java.util.Arrays;

public class PascalTriangleII {
    // T: O(n), S: O(1)
    static int[] pascalTriangleII(int r) {
        int ans[] = new int[r];
        ans[0] = 1;
        for(int i=1; i<r; i++) {
            ans[i] = (ans[i-1]*(r-i))/i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int r = 5;
        System.out.println(Arrays.toString(pascalTriangleII(r)));
    }
}