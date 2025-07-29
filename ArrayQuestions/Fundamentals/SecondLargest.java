import java.util.Arrays;

public class SecondLargest {

    // T: O(nlogn + n), S: O(1)
    static int secondLargest_brute(int arr[]) {
        Arrays.sort(arr);
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] != arr[arr.length-1]) {
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }

    // T: O(n+n), S: O(1)
    static int secondLargest_better(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(secmax < arr[i] && arr[i] != max) {// not write secmax != max, coz updating with value arr[i], not secmmax, so check with it
                secmax = arr[i];
            }
        }
        return secmax;
    }
    
    // T: O(n), S: O(1)
    static int secondLargest_opt(int arr[]) {
        int max = 0;
        int secmax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                secmax = max;
                max = arr[i];
            }
            if(secmax < arr[i] && arr[i] > max) {
                secmax = arr[i];
            }
        }
        return secmax;
    }
    public static void main(String[] args) {
        int arr[] = {8, 8, 7, 6, 5};
        System.out.println(secondLargest_brute(arr));
        System.out.println(secondLargest_better(arr));
        System.out.println(secondLargest_opt(arr));
    }
}