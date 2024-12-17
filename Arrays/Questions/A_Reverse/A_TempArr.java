package A_Reverse;

import java.util.Arrays;

public class A_TempArr {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(N)
        //SPACE COMPLEXITY - O(N)
        int arr[] = {10, 2, 4, 6, 1, 11, 8};
        System.out.println("Original array: "+Arrays.toString(arr));
        System.out.println("Reversed array: "+Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int arr[]) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length-i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}