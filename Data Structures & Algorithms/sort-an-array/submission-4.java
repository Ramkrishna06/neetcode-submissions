class Solution {
    public int[] sortArray(int[] nums) {
        // using merge sort for O(nlogn) solutions
        int si = 0;
        int ei = nums.length - 1;
        mergesort(si, ei, nums);
        return nums;
    }
    public static void mergesort(int si, int ei, int nums[]) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergesort(si, mid, nums);
        mergesort(mid + 1, ei, nums);
        merge(si, mid, ei, nums);
    }

    public static void merge(int si, int mid, int ei, int nums[]) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <=mid) {
            temp[k++] = nums[i++];
        }

        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        for (k = 0, i = si; k < temp.length; i++, k++) {
            nums[i] = temp[k];
        }
    }
}