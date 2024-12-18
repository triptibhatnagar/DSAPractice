package Strings.Theory;

import java.util.Arrays;

public class H_StringMethods {
    public static void main(String[] args) {
        String name = "Suryansh Bhatnagar";
        System.out.println(Arrays.toString(name.toCharArray()));//[S, u, r, y, a, n, s, h,  , B, h, a, t, n, a, g, a, r]
        System.out.println(name.toLowerCase());//suryansh bhatnagar
        System.out.println(name.indexOf('a'));//4
        System.out.println("        Kunal       ".strip());//Kunal
        System.out.println(Arrays.toString(name.split(" ")));//[Suryansh, Bhatnagar]
    }
}