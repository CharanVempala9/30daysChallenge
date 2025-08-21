class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        int n=s.length();
        for(int i=0; i<n; i++){
            int val=s.charAt(i)-'a';
            arr[val]++;
        }
        for(int i=0; i<n; i++){
            int temp=s.charAt(i)-'a';
            if(arr[temp]==1){
                return i;
            }
        }
        return -1;
    }
}