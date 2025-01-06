package Searching.Linear_Search;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Tripti";
        char target = 'r';
        System.out.println(search1(name, target));
        System.out.println(search2(name, target));
    }
    static int search1(String str, char target) {
        if(str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
    static boolean search2(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        // FOR
        // for (int i = 0; i < str.length(); i++) {
        //     if(str.charAt(i) == target) {
        //         return true;
        //     }
        // }

        // FOR EACH
        for (char ch : str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
    
}