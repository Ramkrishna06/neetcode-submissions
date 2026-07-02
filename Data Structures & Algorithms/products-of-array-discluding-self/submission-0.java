class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftproduct[] = new int[nums.length];
        leftproduct[0] = nums[0];
        for (int i = 1; i < leftproduct.length; i++) {
            leftproduct[i] = leftproduct[i - 1] * nums[i];
        }

        int rightproduct[] = new int[nums.length];
        rightproduct[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            rightproduct[i] = rightproduct[i + 1] * nums[i];
        }

        int res[] = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (i != 0 && i!=res.length-1) {
                res[i] = leftproduct[i - 1] * rightproduct[i + 1];
            }
            else if(i==0){
                res[i] = rightproduct[i+1];
            }
            else if(i == nums.length-1){
                res[i] = leftproduct[i-1];
            }
        }
        return res;
    }
}
