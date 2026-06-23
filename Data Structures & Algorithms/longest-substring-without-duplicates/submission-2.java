class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        int i=0 ;
        int j=0;
        int maxlength = 0;
        while(j<s.length()){
          char ch = s.charAt(j);
          if(hm.containsKey(ch) && hm.get(ch)>=i){
           i=hm.get(ch)+1;
          }
          maxlength = Math.max(maxlength , j-i+1);
          hm.put(ch ,j);
          j++;
        }
        return maxlength;
    }
}
