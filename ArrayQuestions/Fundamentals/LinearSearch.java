import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    static int linearSearch_firstIdx(int arr[], int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    static boolean linearSearch_bool(int arr[], int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    static List<Integer> linearSearch_allOcc(int arr[], int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 3};
        // int target = 0;
        int target = 3;
        System.out.println(linearSearch_bool(arr, target));
        System.out.println(linearSearch_firstIdx(arr, target));
        System.out.println(linearSearch_allOcc(arr, target));
    }
}