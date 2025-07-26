import java.util.Arrays;

public class Fibonacci {
    // RECURSIVE
    static int fib_rec(int n) {
        if(n <= 1) 
            return n;
        return fib_rec(n-1)+fib_rec(n-2);
    }
    // MEMOIZATION
    static int fib_mem(int n, int dp[]) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = fib_mem(n-1, dp)+fib_mem(n-2, dp);
    }
    // TABULATION
    static int fib_tab(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    // SPACE OPTIMZATION
    static int fib_spaceOpt(int n) {
        int prev2 = 0;
        int prev1 = 1;
        int curri = prev1+prev2;
        for (int i = 2; i <= n; i++) {
            curri = prev1+prev2;
            prev2 = prev1;
            prev1 = curri;
        }
        return curri;
    }
    public static void main(String[] args) {
        int n = 7;// 0 1 1 2 3 5 8
        // System.out.println(fib_rec(n));

        int dp[] = new int[n+1];// size = no of subproblems
        // for (int i = 0; i < dp.length; i++) {
        //     dp[i] = -1;
        // }
        Arrays.fill(dp, -1);
        // System.out.println(fib_mem(n, dp));

        // System.out.println(fib_tab(n));

        System.out.println(fib_spaceOpt(n));
    }
}
