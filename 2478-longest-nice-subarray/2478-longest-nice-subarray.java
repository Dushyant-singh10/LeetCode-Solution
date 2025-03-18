class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            for (int j = left; j < right; j++) {
                if ((nums[right] & nums[j]) != 0) {
                    left = j + 1;
                }
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}