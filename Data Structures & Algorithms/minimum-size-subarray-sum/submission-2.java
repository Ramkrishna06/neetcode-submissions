class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int minlenght = Integer.MAX_VALUE;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                minlenght = Math.min(minlenght, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return minlenght == Integer.MAX_VALUE ? 0 : minlenght;
    }
}