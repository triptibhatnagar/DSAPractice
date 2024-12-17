package A_Reverse;

import java.util.Arrays;
import Swap.Swap;

public class B_TwoPointers {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(N)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {6, 5, 4, 2, 10, 1};
        System.out.println("Original array: "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array: "+Arrays.toString(arr));
    }

    static void reverse(int arr[]) {
        //two pointers and swap approach
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            Swap.swap(arr, start, end);
            start++;
            end--;
        }
    }
}