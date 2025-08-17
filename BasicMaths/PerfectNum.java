public class PerfectNum {
    static boolean isPerfect_brute(int n) {
        int sum = 0;
        for(int i=1; i<n; i++) {
            if(n%i == 0) 
                sum += i;
        }
        return sum == n;
    }
    static boolean isPerfect_opt(int n) {
        if(n == 1)
            return false;
        int sum = 0;
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                sum += i;
                if((n/i) != n && (n/i) != i) // 36/1 = 36 x, 36/6 = 6 x
                    sum += (n/i);
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPerfect_brute(n));
        System.out.println(isPerfect_opt(n));
    }
}