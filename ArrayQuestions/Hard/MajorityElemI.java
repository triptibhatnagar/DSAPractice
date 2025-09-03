import java.util.HashMap;
import java.util.Map;

public class MajorityElemI {
    // T:O(n^2), S: O(1)
    static int q1_brute(int arr[]) {
        for (int i = 0; i < arr.length; i++) {// possible elem
            int count = 0;
            for (int j = 0; j < arr.length; j++) {// counting its freq
                if(arr[i] == arr[j])
                    count++;
            }
            if(count > arr.length/2)
                return arr[i];
        }
        return -1;
    }
    // T:O(n^2), S: O(1)
    static int q1_better(int arr[]) {
        // storing counts inside hashmap
        // <element, count>
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        // now elements and counts are stored
        // iterate on hashmap to find ans
        for (Map.Entry<Integer, Integer> x: map.entrySet()) {
            System.out.println(x);
            if(x.getValue() > arr.length/2)
                return x.getKey();
        }
        return -1;
    }
    static int q1_optimal(int arr[]) {
        int elem = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(cnt == 0) {// no elem has been assumed as answer, every elem occurence till now has become neutral
                elem = arr[i];// assume the elem
                cnt = 1;// count it
            }else if (elem == arr[i])// found another elem
                cnt++;// increase count
            else // elem not found
                cnt--;// decrease cnt (basically the arrival of other elem instead of assumed elem decreases its chances of being a majority elem)
        }
        return elem;
    }
    public static void main(String[] args) {
        int arr[] = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        // System.out.println(q1_brute(arr));
        // System.out.println(q1_better(arr));
        System.out.println(q1_optimal(arr));
    }
}