public class PrimeNum {
    static boolean isPrime_brute(int n) {
        if(n <= 1)
            return false;
        for(int i=2; i<n; i++) {
            if(n%i == 0) 
                return false;
        }
        return true;
    }
    static boolean isPrime_opt(int n) {
        if(n <= 1)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 29;
        System.out.println(isPrime_brute(n));
        System.out.println(isPrime_opt(n));
    }
}