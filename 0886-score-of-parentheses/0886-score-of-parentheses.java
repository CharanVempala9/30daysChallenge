class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(0);
            } else {
                int v = st.pop();
                int top = st.pop();
                if (v == 0) {
                    st.push(top + 1); 
                } else {
                    st.push(top + 2 * v); 
                }
            }
        }
        
        return st.pop();
    }
}
