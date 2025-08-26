class Solution {
    public String convert(String s, int n) {
        StringBuilder[] arr=new StringBuilder[n];
        int idx=0;
        for (int i = 0; i < n; i++) arr[i] = new StringBuilder();
        while(idx<s.length()){
            for(int i=0; i<n && idx<s.length(); i++){
                arr[i].append(s.charAt(idx));
                idx++;
            }
            for(int i=n-2; i>0 && idx<s.length(); i--){
                arr[i].append(s.charAt(idx));
                idx++;
            }
        }
        StringBuilder res= new StringBuilder();
        for(int i=0; i<n; i++){
            res.append(arr[i]);
        }
        return res.toString();
    }
}