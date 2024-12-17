package A_Reverse;
import java.util.Arrays;

public class C_Swap {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(N)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {10, 2, 4, 6, 1, 11, 8};
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Reversed Array: "+Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int arr[]) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}