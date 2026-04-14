class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int r = (int)Math.cbrt(n) + 1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 1; i <= r; i++) {
            int l1 = i * i * i;
            for (int j = i; j <= r; j++) {
                int l2 = j * j * j;
                int res = l1 + l2;
                if (res > n) break; 
                hm.put(res,hm.getOrDefault(res,0)+1);
            }
        }
        ArrayList<Integer>ls=new ArrayList<>();
        for(int val:hm.keySet()){
            if(hm.get(val)>=2)ls.add(val);
        }
        Collections.sort(ls);
        return ls;
    }
}