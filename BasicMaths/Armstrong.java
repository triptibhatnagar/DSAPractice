public class Armstrong {
    static int countDigit(int n) {
        if(n == 0)
            return 1;
        n = Math.abs(n);
        return (int) Math.log10(n)+1;
    }
    static boolean isArmstrong(int n) {
        int sum = 0;
        int origNum = n;
        int cnt = countDigit(n);
        while(n > 0) {
            int num = n%10;
            sum += Math.pow(num, cnt);
            n /= 10;
        }
        return (sum == origNum);
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }
}
