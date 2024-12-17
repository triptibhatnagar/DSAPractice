package C_KthMaxMin;
import java.util.Arrays;

public class D_CountingSortCF {//Not efficient for large range of elements
    public static void main(String[] args) {
        /*
        TIME COMPLEXITY - O(N + max_element), where max_element is the maximum element of the array.
        SPACE COMPLEXITY - O(max_element)
        */
        int arr[] = {6, 15, 4, 12, 10, 1, 16};//1, 4, 6, 10, 12, 15, 16
        int k = 3;
        System.out.println(k+"th min element: "+kthmin(arr, k));
    }
    static int kthmin(int arr[], int k) {
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
        int freq[] = new int[max+1];
        Arrays.fill(freq, 0);
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int count = 0;//counter for k
        for (int i = 0; i < freq.length; i++) {// for kth max element : int i = freq.length-1; i >= 0; i--
            if(freq[i] != 0) {
                count += freq[i];//count++
                if(count >= k) {
                    return i;
                }
            }
        }
        return -1;
    }
}