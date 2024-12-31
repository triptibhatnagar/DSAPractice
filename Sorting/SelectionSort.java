package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,-5,1,-2,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int maxElemIdx = 0;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[maxElemIdx] < arr[j]) {
                    maxElemIdx = j;
                }
            }
            //swap
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[maxElemIdx];
            arr[maxElemIdx] = temp;
            // System.out.println(Arrays.toString(arr));
        }
        /*
        ------------------- SELECTION SORT -------------------
        select an elem and put it at its correct position
        this can be done in 2 ways
        1) select the largest elem and swap with correct index value
        4,5,1,2,3
        max = 5
        4,3,1,2,5
        max = 4
        2,3,1,4,5
        max = 3
        2,1,3,4,5
        max = 2
        1,2,3,4,5 = answer

        2) select the smallest elem and swap with correct index value
        4,5,1,2,3
        min = 1
        1,5,4,2,3
        min = 2
        1,2,4,5,3
        min = 3
        1,2,3,5,4
        min = 4
        1,2,3,4,5 = answer

        ------------------- COMPLEXITY ANALYSIS -------------------
        1st step: 4,5,1,2,3
        find max :-
        max = 4
        5>4 -> max = 5
        1>5
        2>5
        3>5
        => max = 5
        comparisons = n-1
        swap with n-1 index

        2nd step: 4,3,1,2,5
        find max :-
        max = 4
        3>4
        1>4
        2>4
        => max = 4
        comparisons = n-2
        swap with n-2 index

        3rd step: 2,3,1,4,5
        find max :-
        max = 2
        3>2 -> max = 3
        1>3
        => max = 3
        comparisons = n-3
        swap with n-3 index

        4th step: 2,1,3,4,5
        find max :-
        max = 2
        1>2
        => max = 2
        comparisons = n-4
        swap with n-4 index

        1,2,3,4,5

        Total comparisons = n-1 + n-2 + n-3 + n-4 = 4n - (1+2+3+4) = (n-1)*n - ([n*(n+1)/2] - n) = n*(n-1)/2 ~~ O(n^2)

        WORST CASE - O(N^2)
        BEST CASE - O(N^2)
        STABILITY - NO -> UNSTABLE SORTING

        IT PERFORMS WELL ON SMALL LISTS/ARRAYS
        */
    }
}
