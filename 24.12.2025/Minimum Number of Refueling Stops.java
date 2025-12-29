class Solution {
    public int minRefuelStops(int target, int fuel, int[][] s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0, ans = 0;
        while (fuel < target) {
            while (i < s.length && s[i][0] <= fuel)
                pq.offer(s[i++][1]);
            if (pq.isEmpty()) return -1;
            fuel += pq.poll();
            ans++;
        }
        return ans;
    }
}
