import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static void func(int open, int close, int n, String str, List<String> ans) {
        if(open+close == 2*n && open == close) {
            ans.add(str);
            return;
        }
        if(open < n) {
            func(open+1, close, n, str+"(", ans);
        }
        if(close < open) {
            func(open, close+1, n, str+")", ans);
        }
    }
    static List<String> genParanthesis(int n) {
        List<String> ans = new ArrayList<>();
        func(0, 0, n, "", ans);
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(genParanthesis(n));
    }
}