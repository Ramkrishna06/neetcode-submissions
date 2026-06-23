class Solution {
    public boolean isAnagram(String s, String t) {
      int count[]=new int[26];
      if(s.length() != t.length()){
        return false;
      }else{
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(count[ch-'a']==0){
                return false;
            }
            count[ch-'a']--;
        }
      }
      return true;
    }
}
