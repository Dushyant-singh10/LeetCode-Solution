class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for(int i=0 ; i<n ; i++){
            if(isPresent(matrix[i],0,matrix[i].length - 1,target)){
                return true;
            }
        }
        return false;
    }

    private static boolean isPresent(int[] arr, int low, int high,int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}