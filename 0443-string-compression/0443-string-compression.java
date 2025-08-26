class Solution {
    public int compress(char[] chars) {
        int cnt = 1;
        int idx = 0;
        int n = chars.length;
        if (n < 2) return n;

        for (int i = 1; i < n; i++) {
            if (chars[i] == chars[i - 1]) {
                cnt++;
            } else {
                chars[idx++] = chars[i - 1];
                if (cnt > 1) {
                    String s = Integer.toString(cnt);
                    for (int j = 0; j < s.length(); j++) {
                        chars[idx++] = s.charAt(j);
                    }
                }
                cnt = 1;
            }
        }
        chars[idx++] = chars[n - 1];
        if (cnt > 1) {
            String s = Integer.toString(cnt);
            for (int j = 0; j < s.length(); j++) {
                chars[idx++] = s.charAt(j);
            }
        }

        return idx;
    }
}
