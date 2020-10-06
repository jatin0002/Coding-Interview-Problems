import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class DiffPairsinanArray {

    public static int findPairs(int[] arr, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= arr[i] && i != j) {
                    if (arr[j] - arr[i] == k) {
                        if (!hs.containsKey(arr[j])) {
                            count++;
                        }
                        hs.put(arr[j], arr[i]);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 4, 1, 5 };
        int res = findPairs(arr, 0);
        System.out.println(res);
    }
}
