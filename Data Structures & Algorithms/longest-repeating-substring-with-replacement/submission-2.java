class Solution {
    public int characterReplacement(String s, int k) {
        // The logic is to find the replaceable char which we get usign lenght - maxFreq given
        // posssiblity that we can replace remaning element or not whywe have subtracted maxFreq
        // beacuse is naive to reduce elemnt with less occurences

        HashMap<Character, Integer> hm = new HashMap<>();
        int j = 0;
        int i = 0;
        int maxlength = 0;
        int maxFreq = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, hm.get(ch));
            // if we get more char to chage which is greater than k
            while ((j - i + 1) - maxFreq > k) {
                char c = s.charAt(i);
                hm.put(c, hm.get(c) - 1);
                i++;
                int maxf = 0;
                for (Map.Entry<Character, Integer> h : hm.entrySet()){
                    maxf = Math.max(maxf, h.getValue());
                }
                maxFreq = maxf;
            }
            if ((j - i + 1) - maxFreq <= k) {
                maxlength = Math.max(maxlength, j - i + 1);
                j++;
            }
        }
        return maxlength;
    }
}
