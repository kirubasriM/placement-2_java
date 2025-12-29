class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) { min = Math.min(min,n); max = Math.max(max,n); }
        int size = Math.max(1,(max-min)/(nums.length-1));
        int cnt = (max-min)/size + 1;
        int[] bMin = new int[cnt], bMax = new int[cnt];
        Arrays.fill(bMin, Integer.MAX_VALUE);
        Arrays.fill(bMax, Integer.MIN_VALUE);

        for (int n : nums) {
            int i = (n - min) / size;
            bMin[i] = Math.min(bMin[i], n);
            bMax[i] = Math.max(bMax[i], n);
        }

        int gap = 0, prev = min;
        for (int i = 0; i < cnt; i++) {
            if (bMin[i] == Integer.MAX_VALUE) continue;
            gap = Math.max(gap, bMin[i] - prev);
            prev = bMax[i];
        }
        return gap;
    }
}
