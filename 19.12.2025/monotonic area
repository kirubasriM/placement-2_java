class Solution {
    public boolean isMonotonic(int[] nums) {
        for (int j = 1, x = 0; j < nums.length; j++) {
            if (x != 0) {
                int z = nums[j] - nums[j - 1];

                if (((x > 0) && (z < 0)) || ((x < 0) && (z > 0))) return false;
            } else x = nums[j] - nums[j - 1];
        } 

        return true;
    }
}
