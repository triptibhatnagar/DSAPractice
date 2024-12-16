package Arrays.Theory;

import java.util.Arrays;
import java.util.Scanner;

public class B_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INPUT, OUTPUT IN ARRAY

        //array of primitives
        int arr1[] = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        for (int i : arr1) {//for every elem in array, print the element
            System.out.print(i+" ");//i represents element of array
        }
        System.out.println(Arrays.toString(arr1));//[1, 9, 7, 5, 4]

        // System.out.println(arr1[5]);//Index 5 out of bounds for length 5

        //Array of objects
        String strs[] = new String[5];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
        }
        System.out.println(Arrays.toString(strs));//[aa, bb, cc, dd, ee]

        //mofdify
        strs[3] = "Tripti";
        System.out.println(Arrays.toString(strs));//[aa, bb, cc, Tripti, ee]

        sc.close();
    }
}
