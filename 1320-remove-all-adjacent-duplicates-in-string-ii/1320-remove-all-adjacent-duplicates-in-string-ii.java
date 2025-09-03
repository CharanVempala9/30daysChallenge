import java.util.Stack;

class Solution {

    private static class Pair {
        char ch;
        int count;
        
        public Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek().ch == c) {
                st.peek().count++;
                if (st.peek().count == k) {
                    st.pop();
                }
            } else {
                st.push(new Pair(c, 1));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            Pair p = st.pop();
            for (int i = 0; i < p.count; i++) {
                sb.append(p.ch);
            }
        }
        
        return sb.reverse().toString();
    }
}