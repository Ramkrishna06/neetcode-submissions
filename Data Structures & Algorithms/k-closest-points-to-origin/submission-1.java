class Solution {
    public class Info implements Comparable<Info> {
        int dis;
        int arr[];

        Info(int dis, int arr[]) {
            this.dis = dis;
            this.arr = arr;
        }

        @Override
        public int compareTo(Info p2) {
            return (this.dis - p2.dis);
        }
    }
    public int[][] kClosest(int[][] points, int k) {

        //n for traversal array;
        // /priorityqueue  = logn
        //so t.c = nlogn  + klogn
        PriorityQueue<Info> pq = new PriorityQueue<>();

        for (int arr[] : points) {
            int x = arr[0];
            int y = arr[1];

            int dis = (int)(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
            pq.add(new Info(dis, new int[] {x, y}));
        }

        int res[][] = new int[k][2];
        for (int i = 0; i < res.length; i++) {
            Info val = pq.poll();
            int minCoordinate[] = new int[2];
            minCoordinate[0] = val.arr[0];
            minCoordinate[1] = val.arr[1];
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = minCoordinate[j];
            }
        }

        return res;
    }
}
