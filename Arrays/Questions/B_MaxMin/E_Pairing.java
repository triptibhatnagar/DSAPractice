package B_MaxMin;

public class E_Pairing {
    public static void main(String[] args) {
        //if odd -> mark first elem as max and min, then do comparison in pairing
        //if even -> mark first and second elem as max and min, then do comparison in pairing
        // TIME COMPLEXITY - O(N)
        // SPACE COMPLEXITY - O(1)
        // NO OF COMPARISONS -
        // if odd - 3*(n-1)/2
        // if even - 1 + 3*(n-2)/2
        int arr[] = {6, 15, 4, 12, 10, 1};
        maxmin(arr);
    }
    static void maxmin(int arr[]){
        int max, min;
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        if(arr.length%2 != 0) {
            max = arr[0];
            min = arr[0];  
        }else {
            if(arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            }else {
                max = arr[1];
                min = arr[0];
            }
        }
        int i = 2;
        while(i < arr.length-1) {
            if(arr[i] > arr[i+1]) {
                if(arr[i] > max) {
                    max = arr[i];
                }
                if(arr[i+1] < min) {
                    min = arr[i+1];
                }
            }else {
                if(arr[i+1] > max) {
                    max = arr[i+1];
                }
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            i = i+2;
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}