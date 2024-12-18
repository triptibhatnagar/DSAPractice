package Strings.Theory;

public class G_SB {
    public static void main(String[] args) {
        //mutable
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            sb.append(ch);
        }
        System.out.println(sb);//abcdefghijklmnopqrstuvwxyz
        System.out.println(sb.toString());//abcdefghijklmnopqrstuvwxyz

        sb.deleteCharAt(0);
        System.out.println(sb);//bcdefghijklmnopqrstuvwxyz

        sb.reverse();
        System.out.println(sb);//zyxwvutsrqponmlkjihgfedcb
    }
}