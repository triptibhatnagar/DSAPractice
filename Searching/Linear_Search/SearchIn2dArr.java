package Searching;

import java.util.Arrays;

public class SearchIn2dArr {
    public static void main(String[] args) {
        int arr[][] = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        System.out.println(Arrays.toString(searchIn2dArr(arr, 34)));
        System.out.println(maxIn2dArr(arr));
    }
    static int[] searchIn2dArr(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {// 2d array is array of arrays
                if(arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int maxIn2dArr(int arr[][]) {
        int max = Integer.MIN_VALUE;
        if(arr.length == 0) {
            return max;
        }
        for (int[] i: arr) {
            for (int j : i) {
                if(max < j) {
                    max = j;
                }
            }
        }
        return max;
    }
}