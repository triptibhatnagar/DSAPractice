import java.util.ArrayList;

public class Leaders {
    static ArrayList<Integer> leaders_brute(int[] nums) {
        // T: O(n^2), S: O(n)
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
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 3, 1, 2};
        System.out.println(leaders_brute(nums));
    }
}