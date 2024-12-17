package B_MaxMin;

public class D_Tournament {
    static class Pair{
        int max;
        int min;
    }
    public static void main(String[] args) {
        //divide array, compare min and max of two parts
        
        // TIME COMPLEXITY - O(n)
        // SPACE COMPLEXITY - O(log n)
        // NO OF COMPARISONS -
        // 3*n/2 -2 <= if n is power of 2
        // more than 3*n/2 -2 <= if n is not a power of 2
        
        int arr[] = {6, 15, 4, 12, 10, 1};
        Pair mm = maxmin(arr, 0, arr.length-1);
        System.out.println("Max: "+mm.max);
        System.out.println("Min: "+mm.min);
    }

    static Pair maxmin(int arr[], int start, int end) {
        Pair mm = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        if(arr.length == 0) {
            System.out.println("Array is empty");
            mm.max = -1;
            mm.min = -1;
            return mm;
        }
        if(start == end) {//1 elem
            mm.max = arr[start];
            mm.min = arr[start];
            return mm;
        }
        if(start == end-1) {//2 elem
            if(arr[start] > arr[end]) {
                mm.max = arr[start];
                mm.min = arr[end];
            }else {
                mm.max = arr[end];
                mm.min = arr[start];
            }
            return mm;
        }
        int mid = (start+end)/2;
        mml = maxmin(arr, start, mid);
        mmr = maxmin(arr, mid+1, end);
        //comparing max
        if(mml.max < mmr.max) {
            mm.max = mmr.max;
        }else {
            mm.max = mml.max;
        }
        //comparing min
        if(mml.min < mmr.min) {
            mm.min = mml.min;
        }else {
            mm.min = mmr.min;
        }
        return mm;
    }
}