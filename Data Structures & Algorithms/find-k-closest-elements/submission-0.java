class Solution {
    class Pair implements Comparable<Pair> {
        int value;
        int diff;

        Pair(int value ,int diff) {
            this.value = value;
            this.diff = diff;
        }

        @Override
        public int compareTo(Pair other) {
            if(this.diff - other.diff == 0){
               return this.value - other.value;
            }
            return this.diff - other.diff;
            //negative - this should come before other
            // positive - this should come after other
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> p = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int diff = Math.abs(arr[i] - x);
            p.add(new Pair(val, diff));
            if (p.size() > k) {
                p.poll();
            }
        }

        List<Integer> li = new ArrayList<>();
        while (p.size() > 0) {
            Pair res = p.poll();
            li.add(res.value);
        }
        Collections.sort(li);
        return li;
    }
}