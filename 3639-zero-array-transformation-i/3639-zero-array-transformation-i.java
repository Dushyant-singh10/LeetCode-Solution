class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] diff = new int[nums.length + 1];

        for (int[] q : queries) {
            diff[q[0]]++;
            diff[q[1] + 1]--;
        }

        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += diff[i];
            if (nums[i] - prefixSum > 0) return false;
        }

        return true;
    }
}