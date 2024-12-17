package Swap;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7]
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));//[1, 4, 3, 2, 5, 6, 7]
    }
    public static void swap(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
