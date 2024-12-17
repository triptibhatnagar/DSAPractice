package C_KthMaxMin;

import java.util.PriorityQueue;

public class B_PriorityQHeap {
    public static void main(String[] args) {
        //TIME COMPLEXITY - O(n log k)
        //SPACE COMPLEXITY - O(k)
        int arr[] = {6, 15, 4, 12, 10, 1, 16};//1,4,6,10,12,15,16
        kthmaxmin(arr,3);
    }
    static void kthmaxmin(int arr[], int k) {
        if(arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        if(arr.length < k) {
            System.out.println("Array out of bounds");
            return;
        }
        PriorityQueue<Integer> pqmin = new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer> pqmax = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pqmin.offer(arr[i]);
            if(pqmin.size() > k) {
                pqmin.poll();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            pqmax.offer(arr[i]);
            if(pqmax.size() > k) {
                pqmax.poll();
            }
        }
        System.out.println(k+"th Max element: "+pqmax.peek());
        System.out.println(k+"th Min element: "+pqmin.peek());
    }
}
