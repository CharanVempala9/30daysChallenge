import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k, int op) {
        Arrays.sort(nums);
        Map<Integer, Integer> mp = new HashMap<>();
        for (int it : nums) {
            mp.put(it, mp.getOrDefault(it, 0) + 1);
        }

        int n = nums.length, ans = 1;

        for (int target = nums[0]; target <= nums[n - 1]; target++) {
            int l = target - k;
            int r = target + k;

            int left = lowerBound(nums, l);
            int right = upperBound(nums, r) - 1;

            int freq = mp.getOrDefault(target, 0);
            int rangeSize = right - left + 1;

            ans = Math.max(ans, freq + Math.min(op, rangeSize - freq));

            if (ans == n) return n;
        }

        return ans;
    }

    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    private int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
