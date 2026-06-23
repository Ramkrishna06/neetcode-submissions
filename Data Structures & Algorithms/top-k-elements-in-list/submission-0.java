class Solution {

    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer ,Integer > hm =new HashMap<>();
       for(int i=0;i<nums.length;i++){
           hm.put(nums[i],hm.getOrDefault(nums[i] , 0)+1);
       }

       int arr[] = new int[k];
       int i=0;
       while(k>0){
         int max = Integer.MIN_VALUE;
         int maxKey=-1;
         for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        arr[i++]=maxKey;
            //makrket as used 
            hm.put(maxKey,-1);
            k--;
      }
      return arr;
    }
}
