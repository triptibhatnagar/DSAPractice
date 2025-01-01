package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int arr[]) {
        boolean isSwapped = false;
        // run the steps n-1 times
        for (int i = 0; i < arr.length-1; i++) {//passes
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {//comparisons
                // compare
                if(arr[j] < arr[j-1]) {
                    isSwapped = true;
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            // if you did not swap for a particular value of i, it means array is sorted, hence stop the program
            if(!isSwapped) {
                break;
            }
        }
    }
    /*
        ------------------- BUBBLE SORT/ SINKING SORT/ EXCHANGE SORT -------------------
        BUBBLE SORT is basically a comparison sort method
        as Idea: with every sorting algo that we do, we are going to try something with every pass(or step)
        i.e. sorting is done step by step

        All sorting algo differ with approach

        Bubble Sort Approach - In every step, you are comparing adjacent elements

        ------------------- WHAT ARE WE DOING IN EVERY SINGLE STEP? -------------------
        Take two elements and compare and swap
        i = 0(first pass)
        3,1,5,4,2
        3>1 -> 1,3,5,4,2
        3>5
        5>4 -> 1,3,4,5,2
        5>2 -> 1,3,4,2,5

        i = 1(second pass)
        1,3,4,2,5
        1>3
        3>4
        4>2 -> 1,3,2,4,5

        i = 2(third pass)
        1,3,2,4,5
        1>3
        3>2 -> 1,2,3,4,5

        i = 3(fourth pass)
        1,2,3,4,5
        1>2

        ------------------- WHY WE ARE DOING IT? -------------------
        With the first pass through the array, the largest elem came to end
        With the second pass through the array, the second largest elem came to second last place
        With the third pass through the array, the third largest elem came to third last place
        With the fourth pass through the array, the fourth largest elem came to fourth last place
        Total elem = 5 (n)
        Passes = 4 (n-1) as remaining one elem needs no comparison

        i = counter
        j = sorting the array step by step
        So, whatever this j is doing, do this (n-1) times

        ------------------- COMPLEXITY OF BUBBLE SORT -------------------
        Space Complexity = O(1) as no extra space required (INPLACE SORTING ALGORITHMS)
        Time Complexity = 
            Best Case = O(n) [ascending order]
            Worst Case = O(n^2) [descending order]

        As the size of array is growing, the no. of comparisons is also growing.

        ------------------- BEST CASE -------------------
        1,2,3,4,5
        1>2
        2>3
        3>4
        4>5
        hence, array is sorted
        NOTE:- When j never swaps for a value of i (ith pass), it means array is sorted, hence you can end the program
        Best Case comaprisons = n-1 ~~ n

        ------------------- WORST CASE -------------------
        5,4,3,2,1
        i=0 -> 1st pass 
        5>4     4,5,3,2,1
        5>3     4,3,5,2,1
        5>2     4,3,2,5,1
        5>1     4,3,2,1,5 
        n-1 comparisons and swaps

        i=1 -> 2nd pass
        4>3     3,4,2,1,5
        4>2     3,2,4,1,5
        4>1     3,2,1,4,5
        n-2 comparisons and swaps

        i=2 -> 3rd pass
        3>2     2,3,1,4,5
        3>1     2,1,3,4,5
        n-3 comparisons and swaps

        i=3 -> 4th pass
        2>1     1,2,3,4,5
        n-4 comparisons and swaps

        Outer loop = n-1
        Inner loop = n-i-1

        Total comparsions = (n-1)+(n-2)+(n-3)+(n-4) = 4n-(1+2+3+4) = (n-1)*n - ([n*(n+1)/2] - n) = n*(n-1)/2 ~~ O(n^2)

        ------------------- STABLE SORTING ALGORITHM -------------------
        Order should be the same when the value is same

        10 `20` 20 30 `10` , where 10 = black ball and `10` = red ball

        sorted arr = 10 `10` `20` 20 30

        In original array, black ball of 10 was before red ball of 10 and
        in sorted array, this order is maintained

        sorted arr = `10` 10 `20` 20 30

        Even though it is sorted by value, it is not sorted in the order that was given initially => this is UNSTABLE


        When the original order is maintained for values that are equal = STABLE SORTING
        When the original order is NOT maintained for values that are equal = UNSTABLE SORTING

        */
}