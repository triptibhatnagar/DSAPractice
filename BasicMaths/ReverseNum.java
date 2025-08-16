public class ReverseNum {
    static int reverseNum(int n) {
        int sign = (n>0) ? 1 : -1;
        n = Math.abs(n);
        int ans = 0;
        while (n > 0) {
            // ans += n%10;
            // ans *= 10;
            ans = (ans*10) + (n%10);
            n /= 10;
        }
        // ans = ans/10;
        return ans*sign;
    }
    public static void main(String[] args) {
        int n = -798;
        System.out.println(reverseNum(n));
    }
}