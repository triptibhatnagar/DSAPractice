package B_MaxMin;

public class C_LinearSearch {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(N)
        //SPACE COMPLEXITY - O(1)
        //NO OF COMPARISONS -
        //worst case: 1+2*(n-2) -> descending order
        //best case: 1+n-2 -> ascending order
        int arr[] = {6, 15, 4, 12, 10, 1};
        int max = arr.length-1;
        int min = 0;
        maxmin(arr, max, min);
        //min, max parameters
    }

    static void maxmin(int arr[], int max, int min) {
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        if(arr.length == 1) {
            max = arr[0];
            min = arr[0];
            System.out.println("Max: "+max);
            System.out.println("Min: "+min);
            return;
        }
        if(arr[0] > arr[1]) {
            max = arr[0];
            min = arr[1];
        }else {
            max = arr[1];
            min = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }else if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}