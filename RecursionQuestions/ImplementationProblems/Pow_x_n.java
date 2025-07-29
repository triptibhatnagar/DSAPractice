public class Pow_x_n {
    // T: O(n), S: O(1)
    static double powxn_brute(double x, int n) {
        if(n == 0 || x == 1.0) {
            return 1.0;
        }
        long temp = n;
        if(n < 0) {
            x = 1/x;
            temp = -1L*temp;
        }
        double ans = 1;
        for(long i=0; i<temp; i++) {
            ans *= x;
        }
        return ans;
    }

    // T: O(logn) [splitting], S: O(logn) [max height of filled stack]
    static double power(double x, int n) {
        if(n == 0 || x == 1) {
            return 1;
        }
        if(n == 1) {
            return x;
        }
        if(n%2 == 0) {
            return power(x*x, n/2);
        }
        return x*power(x, n-1);
    }
    static double myPow(double x, int n) {
        // odd : 2^49 = 2 * 2^48 = 2 * f(2, 48)
        // even : 2^48 = (2^2)^24 = f(2*2, 24)

        if(n < 0) {
            if (n == Integer.MIN_VALUE) {
                // handle separately to avoid overflow
                return 1.0 / (x * power(x, Integer.MAX_VALUE));
            }
            return 1 / power(x, -1*n);
        }
        return power(x, n);
    }
    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        System.out.println(powxn_brute(x, n));
        System.out.println(myPow(x, n));
    }
}