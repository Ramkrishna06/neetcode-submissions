class Solution {
    public String longestCommonPrefix(String[] strs) {
       //sortin the string;
       Arrays.sort(strs);
       int n=strs.length;
       //taking first and last string for comparasion
       String first = strs[0];
       String last = strs[n-1];
       StringBuilder sb= new StringBuilder();
       for(int i=0;i<first.length();i++){
         if(first.charAt(i)==last.charAt(i)){
            char ch = first.charAt(i);
            sb.append(ch);
         }else{
            break;
         }
       }
       return sb.toString();
       
    }
}