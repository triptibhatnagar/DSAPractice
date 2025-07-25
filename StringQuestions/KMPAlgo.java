import java.util.ArrayList;
import java.util.List;

public class KMPAlgo {
    static List<Integer> kmp_brute(String str) {
        List<Integer> lps = new ArrayList<>();
        lps.add(0);
        for (int i = 1; i < str.length(); i++) {
            for(int j=1; j<=i; j++) {
                if(str.substring(0, j).equals(str.substring(i-j+1, i+1))) {
                    lps.add(j);
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "abcdabca";
        System.out.println(kmp_brute(str));
    }
}
