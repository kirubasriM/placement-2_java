class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long)Math.sqrt(c);
        
        while (a <= b) {
            long sum = a * a + b * b;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.judgeSquareSum(5));  // true
        System.out.println(sol.judgeSquareSum(3));  // false
        System.out.println(sol.judgeSquareSum(0));  // true
        System.out.println(sol.judgeSquareSum(1));  // true
    }
}
