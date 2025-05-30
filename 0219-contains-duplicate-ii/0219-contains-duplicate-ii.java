class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= k + i; j++) {
                if (nums[i] == nums[j]) {
                    if (Math.abs(i - j) <= k) return true;
                }
            }
        }
        return false;
    }
}
