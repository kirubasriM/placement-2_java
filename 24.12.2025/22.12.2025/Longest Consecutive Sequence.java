import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longest = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int cur = n, streak = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
}
