class Solution {
    public int maximalRectangle(char[][] m) {
        if (m.length == 0) return 0;
        int[] h = new int[m[0].length];
        int max = 0;

        for (char[] row : m) {
            for (int i = 0; i < row.length; i++)
                h[i] = row[i] == '1' ? h[i] + 1 : 0;
            max = Math.max(max, largestRectangleArea(h));
        }
        return max;
    }

    int largestRectangleArea(int[] h) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i <= h.length; i++) {
            int cur = (i == h.length) ? 0 : h[i];
            while (!st.isEmpty() && cur < h[st.peek()]) {
                int ht = h[st.pop()];
                int w = st.isEmpty() ? i : i - st.peek() - 1;
                max = Math.max(max, ht * w);
            }
            st.push(i);
        }
        return max;
    }
}
