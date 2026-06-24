class Solution {
    public int characterReplacement(String s, int k) {
        // The logic is to find the replaceable char which we get usign lenght - maxFreq given
        // posssiblity that we can replace remaning element or not whywe have subtracted maxFreq
        // beacuse is naive to reduce elemnt with less occurences

        // HashMap<Character, Integer> hm = new HashMap<>();\
        int arr [] = new int[26];
        int j = 0;
        int i = 0;
        int maxlength = 0;
        int maxFreq = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            arr[ch -'A']++;
            maxFreq = Math.max(maxFreq, arr[ch -'A']);
            // if we get more char to chage which is greater than k
            while ((j - i + 1) - maxFreq > k) {
                char c = s.charAt(i);
                arr[c -'A']--;
                int maxf = 0;
                for (int l=0;l<arr.length;l++){
                  maxf = Math.max(maxf , arr[l]);
                }
                maxFreq = maxf;
                i++;
            }
            if ((j - i + 1) - maxFreq <= k) {
                maxlength = Math.max(maxlength, j - i + 1);
                j++;
            }
        }
        return maxlength;
    }
}
