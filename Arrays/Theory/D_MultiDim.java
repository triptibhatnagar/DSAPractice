package Arrays.Theory;

import java.util.Arrays;
import java.util.Scanner;

public class D_MultiDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2D array
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        // int arr[][] = new int[3][];//rows -> mandatory
        // int arr[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        //an array of arrays

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int arr[][] = {
            {1,2},
            {4,5,6,7},
            {8,9,10}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int arr1[][] = new int[3][2];
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr1.length; j++) {
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }

        //for jagged arr -> column not fixed
        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr1[i].length; j++) {
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        for (int[] is : arr1) {
            System.out.println(Arrays.toString(is));
        }

        sc.close();
    }
}
