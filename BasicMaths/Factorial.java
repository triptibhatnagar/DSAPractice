public class Factorial {
    static int fact(int n) {
        if(n < 0)
            return Integer.MIN_VALUE;
        int fact = 1;
        for(int i=n; i>=1; i--) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = -5;
        System.out.println(fact(n));
    }
}
