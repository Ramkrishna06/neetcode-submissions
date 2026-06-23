class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char arr [] = strs[i].toCharArray();
            Arrays.sort(arr);
            String original = strs[i];
            String sorted = new String(arr);
            if(!hm.containsKey(sorted)){
                hm.put(sorted , new ArrayList<>());
            }
            hm.get(sorted).add(original);
        }

        list.addAll(hm.values());
        return list;
    }
}
