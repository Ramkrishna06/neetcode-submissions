class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> hm = new HashMap<>();

        // 1️⃣ Count frequency
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        // 2️⃣ Put numbers in buckets based on frequency
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        }
     
        int[] res = new int[k];
        int counter = 0;

        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (Integer x : bucket[i]) {
                    if (counter == k) break;   // prevent overflow
                    res[counter++] = x;
                }
            }
        }

        return res;
    }
}
