public class LargestDigit {
    static int largestDigit(int n) {
        n = Math.abs(n);
        int maxi = 0;
        while (n > 0) {
            int num = n%10;
            if(maxi < num) 
                maxi = num;
            n = n/10;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int n = 1020;
        System.out.println(largestDigit(n));
    }
}