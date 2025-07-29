import java.util.Arrays;

public class LargestElement {
    // T: O(nlogn), S: O(1)
    static int largest_brute(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // T: O(n), S: O(1)
    static int largest_opt(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3, 3, 6, 1};
        System.out.println(largest_brute(arr));
        System.out.println(largest_opt(arr));
    }
}