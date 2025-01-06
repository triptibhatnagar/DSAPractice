package Searching.Linear_Search;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {18,12,9,14,77,50};
        // Q - find whether 14 exists in the array or not -> ans = 3
        // Q - find whether 88 exists in the array or not -> ans = -1
        // TIME COMPLEXITY : BASE CASE - O(1)[Constant time complexity], WORST CASE - O(N)[Linear time complexity]
        // BEST CASE - element to be found is at index 0 (1 comparison only), hence size of array does not matter
        // WORST CASE - element not found, size = 100, comparsion = 100, hence size of array matters here
        // SPACE COMPLEXITY - O(1)
        // NO AUXILIARY SPACE

        System.out.println(linearSearch1(arr, 88));
        System.out.println(linearSearch2(arr, 77));
        System.out.println(linearSearch3(arr, 9));
    }
    // return the index if element is found, else return -1
    static int linearSearch1(int arr[], int target) {
        if(arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // search the target and return its value
    static int linearSearch2(int arr[], int target) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int num : arr) {
            if(num == target) {
                return num;
            }
        }
        return Integer.MAX_VALUE;//what if the value is -1, so don't use -1
    }
    // return true if element exists, else false
    static boolean linearSearch3(int arr[], int target) {
        if(arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}