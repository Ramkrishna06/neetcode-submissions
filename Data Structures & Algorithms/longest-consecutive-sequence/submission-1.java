class Solution {
    // public static boolean search(int curr , int arr []){
    //     for(int i=0;i<arr.length;i++){
    //         if(curr == arr[i]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public int longestConsecutive(int[] nums) {
        //better approach
        Arrays.sort(nums);
        int longest = 0;
        int lastelement = Integer.MIN_VALUE;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]-1 == lastelement){
                count++;
                lastelement = nums[i];
            }
            else if(nums[i] != lastelement){
                lastelement = nums[i];
                count = 1;
            }
            longest = Math.max(longest , count);
        }
        return longest;

        //Brute force
        // int count =1;
        // int maxcount = 0;
        // for(int i =0;i<nums.length;i++){
        //     int curr = nums[i];
        //     count = 1;
        //     while(search(curr+1 ,nums) == true){
        //        count++;
        //        curr = curr +1;  
        //     }
        //     maxcount = Math.max(maxcount , count);
        // }
        // return maxcount;
    }
}
