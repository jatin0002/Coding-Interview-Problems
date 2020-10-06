import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
            if (entry.getValue() == 1) {
                res = entry.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 1, 2, 1, 2 };
        int res = singleNumber(arr);
        System.out.println(res);
    }
}
