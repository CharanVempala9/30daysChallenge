class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans= new ArrayList<>();
        HashSet<String>hs=new HashSet<>();
        int n=s.length();
        StringBuilder res=new StringBuilder();
        for(int i=0; i<n; i++){
            res.append(s.charAt(i));
            if(res.length()>10){
                res.deleteCharAt(0);
            }
            if(res.length()==10){
                if(!hs.contains(res.toString()))
                    hs.add(res.toString());
                else{
                    if(!ans.contains(res.toString()))
                    ans.add(res.toString());
                }
            }
        }
        return ans;
    }
}