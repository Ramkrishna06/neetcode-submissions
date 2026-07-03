class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        HashSet<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length-1; i++) {
            HashSet<Integer> hs = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int tofind = -(nums[i] + nums[j]);
                if (hs.contains(tofind)) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.addAll(Arrays.asList(nums[i], nums[j], tofind));
                    Collections.sort(list);
                    result.add(list);
                }
                hs.add(nums[j]);
            }
        }
        for(List<Integer> list : result){
            li.add(list);
        }
        return li;
    }
}
