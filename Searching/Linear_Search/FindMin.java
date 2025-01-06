package Searching.Linear_Search;

public class FindMin {
    public static void main(String[] args) {
        int arr[] = {18,12,-7,3,14,28};
        System.out.println(findMin(arr));
    }
    static int findMin(int arr[]) {
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
