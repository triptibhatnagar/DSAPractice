package E_MoveNegative.WithOrder;

public class C_ModifiedMergeSortWOExtraSp {
    public static void main(String[] args) {
        //TIME COMPLEXITY: O(N log N)
        //SPACE COMPLEXITY: O(N + log N)
        int arr[] = {-12, 11, -13, 14, 15, 16, -18, -20, 21, 22, -23};
        moveNeg(arr, 0, arr.length-1);
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
    static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid+1, R, 0, n2);
        int i = 0;
        int j = 0;
        int k = left;
        //copy negative elem of L
        while(i<n1 && L[i]<0) {
            arr[k++] = L[i++];
        }
        //copy negative elem of R
        while(j<n2 && R[j]<0) {
            arr[k++] = R[j++];
        }
        //copy positive elem of L
        while(i<n1 && L[i]>0) {
            arr[k++] = L[i++];
        }
        //copy negative elem of L
        while(j<n2 && R[j]>0) {
            arr[k++] = R[j++];
        }
    }
    static void moveNeg(int arr[], int left, int right) {
        if(left < right) {
            int mid = left+(right-left)/2;
            moveNeg(arr, left, mid);
            moveNeg(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
}