class Solution {
    public int mirrorFrequency(String s) {
        int n=s.length();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0; i<n; i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int ans=0;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                char pr='.';
                if (ch >= '0' && ch <= '9') {
                    pr = (char)('0' + (9 - (ch - '0')));
                }
                else{
                    pr= (char)('z' - (ch - 'a'));
                }
                System.out.println(pr);
                if(hm.containsKey(pr)){
                    //System.out.println(hm.get(ch)+" "+hm.get(pr));
                    ans+=Math.abs(hm.get(ch)-hm.get(pr));
                    hm.remove(ch);
                    hm.remove(pr);
                }
                else{
                    ans+=hm.get(ch);
                    hm.remove(ch);
                }
            }
            else{
                char pr='.';
                if(ch>='1' && ch<='9'){
                    pr=(char)(9-(ch-'0'));
                }
                else{
                    pr= (char)('z' - (ch - 'a'));
                }
                if(hm.containsKey(pr)){
                    ans+=hm.get(pr);
                    hm.remove(pr);
                }
            }
            //System.out.println(ans);
        }
        return ans;
    }
}