public class PascalTriangleI {
    static int nCr(int n, int r) {
        if(r > n-r)
            r = n-r;
        int ans = 1;
        for(int i=1; i<=r; i++) {
            ans *= n-i+1;
            ans /= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int r = 6;
        int c = 2;
        System.out.println(nCr(r-1, c-1));
    }
}