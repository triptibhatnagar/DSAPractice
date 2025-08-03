import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // T: O(n^2), S: O(1)
    static int[] twoSum_brute(int nums[], int target) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    // T: O(n), S: O(n)
    static int[] twoSum_better(int nums[], int target) {
        // hashing
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    // T: O(nlogn + n), S:O(1)
    static boolean twoSum_tf(int nums[], int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int sum = nums[left]+nums[right];
            if(sum == target) {
                return true;
            }
            if(sum < target) {
                left++;
            }else if(sum > target) {
                right--;
            }
        }
        return false;
    }
    
    // T: O(nlogn + n), S:O(2n)
    static int[] twoSum_opt(int nums[], int target) {
        int storage[][] = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            storage[i][0] = nums[i];
            storage[i][1] = i;
        }
        Arrays.sort(storage, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int sum = nums[left]+nums[right];
            if(sum == target) {
                return new int[] {storage[left][1], storage[right][1]};
            }
            if(sum < target) {
                left++;
            }else if(sum > target) {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, -7, 6, -3};
        // int nums[] = {2, 6, 5, 8, 11};
        int target = 0;
        // int target = 14;
        System.out.println(Arrays.toString(twoSum_brute(nums, target)));
        System.out.println(Arrays.toString(twoSum_better(nums, target)));
        System.out.println(Arrays.toString(twoSum_opt(nums, target)));
        System.out.println(twoSum_tf(nums, target));
    }
}
/*
nums = {2, 6, 5, 8, 11}

storage before sort:
{2, 0}
{6, 1}
{5, 2}
{8, 3}
{11, 4}

storage after sort:
{2, 0}
{5, 2}
{6, 1}
{8, 3}
{11, 4}
*/