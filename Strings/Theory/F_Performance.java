package Strings.Theory;

public class F_Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            // System.out.print(ch+" ");//a b c d e f g h i j k l m n o p q r s t u v w x y z
            series = series + ch; // series += ch
        }
        System.out.println(series);//a b c d e f g h i j k l m n o p q r s t u v w x y z

        /* NOT A GOOD THING
         * ""+"a" = "a"
         * "a"+"b" = "ab"
         * "ab"+"c" = "abc"
         * "abc"+"d" = "abcd"
         * 
         * new object is created every time => m/m wastage
         * not changing original object as strings are immutable
         * copying old one and appending new changes
         * a,ab,abc,......,abcdefghijklmnopqrstuvwxy will have no reference variable
         * size : 1+2+3+.....+n = n(n+1)/2 = 
         * O(n^2) VERY BAD
         */

        //A DATATYPE THAT CHANGE IN ORIGINAL STRING, NOT CREATING NEW ONE EVERYTIME - STRINGBUILDER
        
    }
}