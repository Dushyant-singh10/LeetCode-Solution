class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int digitsum = 0;

            while (n > 0) {
                int digit = n % 10;
                digitsum += digit;
                n = n / 10;

            }
            min = Math.min(min, digitsum);

        }
        return min;
    }

}
