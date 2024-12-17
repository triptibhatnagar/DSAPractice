package A_Reverse;
import java.util.Arrays;

public class D_Recursion {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(N)
        //SPACE COMPLEXITY - O(N) -> recursion stack
        int arr[] = {10, 2, 4, 6, 1, 11, 8};
        int start = 0;
        int end = arr.length-1;
        System.out.println("Original Array: "+Arrays.toString(arr));
        reverse(arr, start, end);
        System.out.println("Reversed Array: "+Arrays.toString(arr));
    }
    static void reverse(int arr[], int start, int end) {
        if(start > end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }
}