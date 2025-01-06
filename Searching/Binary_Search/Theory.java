package Searching.Binary_Search;

public class Theory {
    public static void main(String[] args) {
        int arr[] = {-2,-4,-6,0,11,12,14,20,36,48};
        int target = 12;
        // find whether 36 exists or not
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int arr[], int target) {
        if(arr.length == 0) {
            return -1;
        }
        int start = 0, end = arr.length-1;
        while(start <= end) {
            int mid = (end-start)/2 + start;// (start+end)/2 -> might be possible (start+end) exceeds the range of int
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] < target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        } 
        return -1;
    }
}
/*
---------------- BINARY SEARCH (OPTIMIZED) ----------------
* used for sorted arrays
* arr = [2,4,9,10,12,14,18,19], ascending
* arr = [19,12,6,5,3,2,-8,-16], descending
* max comparsions in linear search in worst case = N

---------------- ALGORITHM OF BINARY SEARCH ----------------
1. Find the middle element
2. if target > middle -> Check on RHS(start = middle+1) - Repeat from 1
    else -> Check on LHS(end = middle-1) - Repeat from step 1
    Search space is dividing by 2 in every step
3. if middle == target -> ans is found

if start> end, element not found

---------------- BEST CASE ----------------
first mid element = target 
O(1)

---------------- WHY BINARY SEARCH? ----------------
Q - Find the max number number of comparisons in worst case
search space = n, n/2, n/4, n/8, ..., 1
level = 0, 1, 2, 3, ..., k
generalized = n/2^0, n/2^1, n/2^2, n/2^3, ..., n/2^k
so, n/2^k = 1 => log n = log (2^k) => log n = k log 2 => k = log n base 2

k = total no of levels in the worst case
Total no. of comparsions in worst case = log n

Q - search in 1,000,000
Linear Search = 1 million comparisons
Binary search = 20 comparisons
*/