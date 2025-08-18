public class GCD {
    static int gcd_brute(int n1, int n2) {
        int maxi = 0;
        for (int i = 1; i < Math.min(n1, n2); i++) {
            if(n1%i == 0 && n2%i == 0) {
                maxi = Math.max(maxi, i);
            }
        }
        return maxi;
    }
    static int gcd_better(int n1, int n2) {
        int gcd = 0;
        for (int i = Math.min(n1, n2); i >= 1 ; i--) {
            if(n1%i == 0 && n2%i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
    static int gcd_opt(int n1, int n2) {
        int gcd = 0;
        for (int i = Math.min(n1, n2); i >= 1 ; i--) {
            if(n1%i == 0 && n2%i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        System.out.println(gcd_brute(n1, n2));
        System.out.println(gcd_better(n1, n2));
    }
}
