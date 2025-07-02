class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        Set<Integer> row0 = new HashSet<>();
        Set<Integer> col0 = new HashSet<>();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row0.add(i);
                    col0.add(j);
                }
            }
        }
        
        for (int r : row0) {
            Arrays.fill(matrix[r], 0);
        }
        
        for (int c : col0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][c] = 0;
            }
        }
    }
}