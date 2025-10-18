import java.util.*;

class Solution {
    public int poss(int val, int k, HashSet<Integer> hs, int st) {
        // Start searching from max(st, val - k)
        for (int i = Math.max(st, val - k); i <= val + k; i++) {
            if (!hs.contains(i)) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int st = Integer.MIN_VALUE / 2;  // initially very small
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int find = poss(nums[i], k, hs, st);
            if (find != Integer.MIN_VALUE) {
                hs.add(find);
                st = find;  // move st forward to avoid rechecking smaller numbers
            }
        }

        return hs.size();
    }
}
