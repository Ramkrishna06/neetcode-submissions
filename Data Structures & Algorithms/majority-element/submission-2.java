class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int key=0;
       HashMap<Integer,Integer> hm =new HashMap<>();
       for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
    }
    for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
        if(entry.getValue() > count){
            count = entry.getValue();
             key = entry.getKey();
        }
    }
    return key;
    }
}