package C_KthMaxMin;

public class C_QuickSelect {//works best in practice
    public static void main(String[] args) {
        /*
        TIME COMPLEXITY - 
        worst case : O(n^2)
        average case : O(n log n)
        performs better than priority queue based algorithm.

        SPACE COMPLEXITY - 
        worst case : O(n) for recursion call stack
        average case : O(Log n)    
        */
        int arr[] = {6, 15, 4, 12, 10, 1, 16};//1, 4, 6, 10, 12, 15, 16
        int k = 3;
        System.out.println(k+"th min element: "+kthmin(arr,k,0,arr.length-1));//3th min element: 6
    }
    static int quickselect(int arr[], int start, int end) {
        int pivot = arr[end];
        int pivotloc = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] < pivot) {// for kth max element: change this condition only to arr[i] > pivot => 3th max element: 12
                int temp = arr[i];
                arr[i] = arr[pivotloc];
                arr[pivotloc] = temp;
                pivotloc++;
            }
        }
        int temp = arr[pivotloc];
        arr[pivotloc] = arr[end];
        arr[end] = temp;
        return pivotloc;
    }
    static int kthmin(int arr[], int k, int start, int end) {
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        if(arr.length < k){
            System.out.println("Array out of bounds");
            return -1;
        }
        int partition = quickselect(arr, start, end);
        if(partition == k-1) {
            return arr[partition];
        }else if(partition < k-1) {//search in right
            return kthmin(arr, k, partition+1, end);
        }else {//search in left
            return kthmin(arr, k, start, partition-1);
        }
    }
}