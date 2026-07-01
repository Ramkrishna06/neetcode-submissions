class Solution {
    public static boolean search(int curr , int arr []){
        for(int i=0;i<arr.length;i++){
            if(curr == arr[i]){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int count =1;
        int maxcount = 0;
        for(int i =0;i<nums.length;i++){
            int curr = nums[i];
            count = 1;
            while(search(curr+1 ,nums) == true){
               count++;
               curr = curr +1;  
            }
            maxcount = Math.max(maxcount , count);
        }
        return maxcount;
    }
}
