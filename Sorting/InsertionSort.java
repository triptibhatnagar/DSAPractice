package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j-1]>arr[j]) {
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
    /*
    ------------------- INSERTION SORT -------------------
    partially sorting the array
    sorting takes place in parts

    * INTUTION
    1) sort till idx = 1
    2) sort till idx = 2
    3) sort till idx = 3
    4) sort till idx = 4

    5,3,4,1,2
    insert idx = 1 element at correct position of its LHS
    i=0 -> 1) 3,5,4,1,2
    insert idx = 2 element at correct position of its LHS
    i=1 -> 2) 3,4,5,1,2
    insert idx = 3 element at correct position of its LHS
    i=2 -> 3) 1,3,4,5,2
    insert idx = 4 element at correct position of its LHS
    i=3 -> 4) 1,2,3,4,5 = answer

    For every index you are at, put that idx elem at the correct index of LHS
    With every pass, the LHS is getting sorted

    ------------------- APPROACH -------------------
    passNo  i   sortTill    j
    1       0   idx1        1
    2       1   idx2        2
    3       2   idx3        3
    4       3   idx4        4

    i=0 to n-2
    j>0

    5,3,4,1,2
    i=0 and j=1
    5>3 -> 3,5,4,1,2

    i=1 and j=2
    5>4 -> 3,4,5,1,2
    j=1
    3>4 -> break
    NOTE:- When elem j not smaller than j-1, break the loop reason , LHS arr is already sorted

    i=2 and j=3
    5>1 -> 3,4,1,5,2
    j=2
    4>1 -> 3,1,4,5,2
    j=1
    3>1 -> 1,3,4,5,2

    i=3 and j=4
    5>2 -> 1,3,4,2,5
    j=3
    4>2 -> 1,3,2,4,5
    j=2
    3>2 -> 1,2,3,4,5
    j=1
    1>2 -> break

    ------------------- COMPLEXITY ANALYSIS -------------------
    WORST CASE: O(N^2)
    5,4,3,2,1
    comparisons:-
    5>4 4,5,3,2,1
    5>3 4,3,5,2,1   4>3 3,4,5,2,1
    5>2 3,4,2,5,1   4>2 3,2,4,5,1   3>2 2,3,4,5,1
    5>1 2,3,4,1,5   4>1 2,3,1,4,5   3>1 2,1,3,4,5   2>1 1,2,3,4,5
    1+2+3+4 comparisons
    Total no of comparisons:- n(n-1)/2 ~~ O(n^2)

    BEST CASE: O(N)
    1,2,3,4,5
    1>2
    2>3
    3>4
    4>5
    4 comparisons
    Total no of comparisons:- n-1

    ------------------- WHY USE IT? -------------------
    * Adaptive - steps get reduced if array is sorted
    * No. of swaps are reduced as compared to bubble sort
    * It is stable
    * It is used for smaller values of n
    * Works good when array is partially sorted> hence it takes part in hybrid sorting algorithms
    */
    }
}