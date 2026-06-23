class Solution {
    public int[] sortArray(int[] nums) {
        //using selection sort
        for(int i=0 ; i<nums.length-1 ; i++){
            int minpos = i;
            for(int j=i+1 ; j<nums.length; j++){
                if(nums[j]<nums[minpos]){
                    minpos=j;
                }
            }
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i]=temp;
        }
        return nums;
    }
}

