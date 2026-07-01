class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0 ;i<nums.length;i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i],0)+1);
        }
       
        List<Integer> li = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() > n/3){
                li.add(entry.getKey());
            }
        }

        return li;
    }
}