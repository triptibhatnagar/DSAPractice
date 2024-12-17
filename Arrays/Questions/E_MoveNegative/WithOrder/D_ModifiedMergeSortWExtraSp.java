package E_MoveNegative.WithOrder;

public class D_ModifiedMergeSortWExtraSp {
    public static void main(String[] args) {
        //TIME COMPLEXITY: O(N log N)
        //SPACE COMPLEXITY: O(log N)
        int arr[] = {-12, 11, -13, 14, 15, 16, -18, -20, 21, 22, -23};
        moveNeg(arr, 0, arr.length-1);
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
    
    static void moveNeg(int arr[], int left, int right) {
        if(left < right) {
            int mid = (right-left)/2 + left;
            moveNeg(arr, left, mid);
            moveNeg(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    static void merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid+1;
        // starting index of positive part in left subarray
        while (i<=mid && arr[i]<0) {
            i++;
        }
        // ending index of negative part in right subarray 
        while (j<=right && arr[j]<0) {
            j++;
        }
        j--;

        reverse(arr, i, mid);//reverse left subarray
        reverse(arr, mid+1, j);//reverse right subarray
        reverse(arr, i, j);//reverse whole subarray
    }
    static void reverse(int arr[], int left, int right) {
        if(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverse(arr, ++left, --right);
        }
    }
}