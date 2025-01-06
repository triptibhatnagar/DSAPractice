package Searching.Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {18,12,-7,3,14,28};
        // Q :- Search for 3 in the range of index [1,4]
        System.out.println(searchInRange(arr, 18, 1, 4));
    }
    static int searchInRange(int arr[], int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}