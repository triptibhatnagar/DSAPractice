package Sorting;

import java.util.Arrays;

public class CyclicSort {
    /*
    ------------------- CYCLIC SORT -------------------
     * Q - unsorted array given, {3,5,2,1,4}, sort this array
     * A - bubble, selection, insertion etc... -> n^2 comparisons
     * What if we have to solve in 1 for loop, only make n comparisons
     * MOST IMPORTANT:- When given numbers ranged from 1 to n, use CYCLIC SORT
     * 
     * ------------------- ALGORITHM -------------------
     * here n=5
     * before sorting = {3,5,2,1,4}     idx-0,1,2,3,4
     * after sorting = {1,2,3,4,5}      idx-0,1,2,3,4
     * => idx = value-1 because idx value starts from 0 and we are given elements from 1 to n
     * 
     * {3,5,2,1,4}
     * SWAPS
     * is 3 at correct idx, so swap with idx 3-1 = 2 -> {2,5,3,1,4}
     * is 2 at correct idx, so swap with idx 2-1 = 1 -> {5,2,3,1,4}
     * is 5 at correct idx, so swap with idx 5-1 = 4 -> {4,2,3,1,5}
     * is 4 at correct idx, so swap with idx 4-1 = 3 -> {1,2,3,4,5}
     * COMPARSIONS
     * is 1 at correct idx, so move forward
     * is 2 at correct idx, so move forward
     * is 3 at correct idx, so move forward
     * is 4 at correct idx, so move forward
     * is 5 at correct idx, so move forward
     * 
     * every unique item is only getting swapped once
     * 
     * ------------------- WORST CASE -------------------
     * n-1 swaps are required
     * This was worst case example
     * 4 swaps + 5 swaps = N-1 + N = 2N-1 swaps in worst case ~~ O(N)
     * 
     * ------------------- APPROACH -------------------
     * CHECK SWAP MOVE
     */
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int arr[]) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }
}