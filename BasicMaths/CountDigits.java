public class CountDigits {
    static int cntDigits(int n) {
        if (n == 0) 
            return 1;
        n = Math.abs(n);
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n = n/10;
        }
        return cnt;
    }
    static int cntDigits_math(int n) {
        if(n == 0)
            return 1;
        n = Math.abs(n);
        return (int) Math.log10(n)+1;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(cntDigits(n));
        System.out.println(cntDigits_math(n));
    }
}