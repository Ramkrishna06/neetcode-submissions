class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = nums1.length;
        int idx =0;
        for(int i=m;i<n1;i++){
            nums1[i] = nums2[idx++];
        }
        Arrays.sort(nums1);
    }
}