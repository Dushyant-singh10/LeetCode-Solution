class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                // move right, we haven’t reached k missing numbers yet
                left = mid + 1;
            } else {
                // move left, maybe kth is before or at mid
                right = mid - 1;
            }
        }

        // after binary search, left is the number of elements in arr before kth missing
        return left + k;
    }
}
