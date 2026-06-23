class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> hm =new HashMap<>();
        for(String s : strs){
            char ch [] = s.toCharArray();
            Arrays.sort(ch);
            String sorteds = Arrays.toString(ch);
            hm.putIfAbsent(sorteds,new ArrayList<>());
            hm.get(sorteds).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
