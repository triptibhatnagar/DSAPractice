package B_MaxMin;

public class A_MaxMin {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(N)
        //SPACE COMPLEXITY - O(1)
        int arr[] = {6, 5, 4, 2, 10, 1};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(maxInRange(arr, 4, 1));
    }
    static int max(int arr[]) {
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    static int min(int arr[]) {
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //find max item in a range
    static int maxInRange(int arr[], int start, int end) {
        if(end < start) {
            return -1;
        }

        if(arr == null) {
            return -1;
        }
        int max = arr[0];
        for (int i = start; i <=end ; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}