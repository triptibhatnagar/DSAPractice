import java.util.Arrays;

public class RearrangeBySign {
    static int[] rearrangeArray_brute(int[] nums) {
        // even places - pos
        // odd places - neg

        // T: O(n+ n/2), S: O(n)
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        int p = 0;
        int n = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                pos[p++] = nums[i];
            }else {
                neg[n++] = nums[i];
            }
        }
        for(int i=0; i<nums.length/2; i++) {
            nums[2*i] = pos[i];
            nums[2*i + 1] = neg[i];
        }
        return nums;
    }

    static int[] rearrangeArray_optimal(int[] nums) {
        // T: O(n), S: O(1)
        int ans[] = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            }else {
                ans[pos] = nums[i];
                pos +=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, -1, -3, -4};
        System.out.println(Arrays.toString(rearrangeArray_brute(nums)));
        System.out.println(Arrays.toString(rearrangeArray_optimal(nums)));
    }
}