class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //if s1 > s2 we return false
        if(s1.length() > s2.length() ) return false;
        //we are here find the subtring of lenght s1 in s2 first
        //apporach is to find the permution and then finding if availlable as substring in s2 or not
        //so in every permutation sorted gives same string right so we can find string of same window size 
        //in s2 substring by sorting it

        char ch [] = s1.toCharArray();
        Arrays.sort(ch);
        String str =new String(ch);
        int n = s1.length();
        for(int i=0;i<s2.length()-n+1;i++){
          String result ="";
          if(i<s2.length()-n){
           result = s2.substring(i,i+n);
          }else{
            result = s2.substring(i);
          }
          char c [] = result.toCharArray();
          Arrays.sort(c);
          String sorted = new String(c);
          if(sorted.equals(str)){
            return true;
          }
        }
        return false;
              

        
    }
}
