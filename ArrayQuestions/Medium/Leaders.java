import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    static ArrayList<Integer> leaders_brute(int[] nums) {
        // T: O(n^2), S: O(1) as extra space to store answer is not considered.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            boolean greater = true;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] <= nums[j]) {// not greater = smaller or equal
                    greater = false;
                    break;
                }
            }
            if(greater) {
                list.add(nums[i]);
            }
        }
        return list;
    }
    static ArrayList<Integer> leaders_optimal(int[] nums) {
        // T: O(n+n) // other n for collections.reverse, S: O(1)
        ArrayList<Integer> list = new ArrayList<>();
        if(nums.length == 0) {
            return list;
        }
        list.add(nums[nums.length-1]);
        int max = nums[nums.length-1];
        for(int i=nums.length-2; i>=0 ; i--) {
            if(nums[i] > max) {
                max = nums[i];
                list.add(nums[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 3, 1, 2};
        System.out.println(leaders_brute(nums));
        System.out.println(leaders_optimal(nums));
    }
}