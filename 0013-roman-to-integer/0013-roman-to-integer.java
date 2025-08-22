class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int n=s.length();
        int ans=0;
        int i=0;
        for(i=1; i<n; i++){
            char ch=s.charAt(i-1);
            char c=s.charAt(i);
            if(ch=='I' && c=='V'){
                ans+=4;
                i++;
            }
            else if(ch=='I' && c=='X'){
                ans+=9;
                i++;
            }
            else if(ch=='X' && c=='L'){
                ans+=40;
                i++;
            }
            else if(ch=='X' && c=='C'){
                ans+=90;
                i++;
            }
            else if(ch=='C' && c=='D'){
                ans+=400;
                i++;
            }
            else if(ch=='C' && c=='M'){
                ans+=900;
                i++;
            }
            else{
                ans+=hm.get(ch);
            }
        }
        //System.out.println(ans);
        System.out.println(i);
        if(i!=n+1)
        ans+=hm.get(s.charAt(n-1));
        return ans;
    }
}