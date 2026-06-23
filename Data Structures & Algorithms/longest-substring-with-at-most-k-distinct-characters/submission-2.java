class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(k==0)return 0;
        HashMap<Character , Integer> hm = new HashMap<>();
        int i=0;
        int j=0;
        int maxlength =0;
        while(j<s.length()){
            char ch = s.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            while(hm.size()>k){
             char c =s.charAt(i);
             hm.put(c ,hm.get(c)-1);
             if(hm.get(c)==0){
                hm.remove(c);
             }
             i++;
            }
            if(hm.size()<=k){
                maxlength = Math.max(maxlength , j-i+1);
            }
            j++;
        }
        return maxlength;
    }
}