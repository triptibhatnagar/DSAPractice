import java.util.HashMap;
import java.util.Map;

public class HighestOccuring {
    // return min of those if maxFreq of more than 1 elem is same
    static int highestOccurElem(int nums[]) {
        // < elem, freq >
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], val+1);
        }
        int maxElem = 0;
        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> x: map.entrySet()) {
            int elem = x.getKey();
            int freq = x.getValue();
            if(maxFreq < freq) {
                maxFreq = freq;
                maxElem = elem;
            }else if(maxFreq == freq) {
                maxElem = Math.min(maxElem, elem);
            }
        }
        return maxElem;
    }
    public static void main(String[] args) {
        int nums[] = {10, 9 ,7};
        System.out.println(highestOccurElem(nums));
    }
}
