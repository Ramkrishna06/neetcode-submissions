class Solution {
    public static boolean binarySearch(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid]> target){
                ei = mid -1;
            }else{
                si =mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target >=nums[i][0]  && target <=nums[i][nums[0].length-1]){
                int arr[] = nums[i];
                if(binarySearch(arr ,target)){
                    return true;
                }
            }
        }
        return false;
    }
}
