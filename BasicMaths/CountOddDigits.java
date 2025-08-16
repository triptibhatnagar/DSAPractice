public class CountOddDigits {
    static int cntOdd(int n) {
        n = Math.abs(n);
        int cnt = 0;
        while (n > 0) {
            int num = n%10;
            if(num%2 == 1)
                cnt++;
            n = n/10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(cntOdd(n));
    }
}
