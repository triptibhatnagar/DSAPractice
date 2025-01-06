package Searching.Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int arr[] = {90,75,18,12,6,4,3,1};
        int arr[] = {1,3,4,6,12,18,75,90};
        int target = 75;
        System.out.println(orderAgnostic(arr, target));
    }
    static int orderAgnostic(int arr[], int target) {
        if(arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (end-start)/2 + start;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[start] < arr[end]) {
                if(arr[mid] < target) {
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if(arr[mid] > target) {
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
// ---------------- ORDER AGNOSTIC BS ----------------
// sorted array but don't know array is sorted in ascending order or descending order

// ---------------- DESCENDING ----------------
// target > mid => LHS => e = m-1
// target < mid => RHS => s = m+1

// ---------------- HOW TO FIND IF SORTED IN ASCENDING OR DESCENDING? ----------------
// take any 2 elements and compare
// but what if arr = [3,3,3,5,9,11]
// best is to compare the first and last elements