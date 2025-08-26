import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        Integer[] myComp = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(myComp, (a, b) -> {
            String s1 = a.toString();
            String s2 = b.toString();
            return (s2 + s1).compareTo(s1 + s2);
        });
        if (myComp[0] == 0) return "0";
        StringBuilder res = new StringBuilder();
        for (int val : myComp) {
            res.append(val);
        }
        return res.toString();
    }
}
