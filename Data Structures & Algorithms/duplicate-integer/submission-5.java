class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==1){
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]==nums[i+1]){
              return true;
            }
        }
        return false;
    }
}