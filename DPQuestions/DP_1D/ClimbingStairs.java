import java.util.Arrays;

public class ClimbingStairs {
    // RECURSIVE
    // TC: O(2^N), SC: O(N)
    static int climbStairs_rec(int n) {
        if(n==0 || n==1) return 1;
        return climbStairs_rec(n-1)+climbStairs_rec(n-2);
    }
    // MEMOIZATION
    // TC: O(N), SC: O(N)+O(N)
    static int f(int n, int dp[]) {
        if(n==0 || n==1) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = f(n-1, dp)+f(n-2, dp);
    }
    static int climbStairs_mem(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }
    // TABULATION
    // TC: O(N), SC: O(N)
    static int f2(int n, int dp[]) {
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    static int climbStairs_tab(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return f2(n, dp);
    }
    // SPACE OPTIMIZATION
    // TC: O(N), SC: O(1)
    static int climbStairs_opt(int n) {
        int prev2 = 1;
        int prev1 = 1;
        int curr = prev2 + prev1;
        for(int i=2; i<=n; i++) {
            curr = prev2+prev1;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs_rec(n));
        System.out.println(climbStairs_mem(n));
        System.out.println(climbStairs_tab(n));
        System.out.println(climbStairs_opt(n));
    }
}