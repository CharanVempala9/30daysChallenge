class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        //System.out.println(words[words.length-1]);
        return words[words.length-1].length();
    }
}