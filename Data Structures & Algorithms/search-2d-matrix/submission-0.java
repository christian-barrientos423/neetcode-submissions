class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0]) {
            return false;
        }
        int rowIndex = 0;
        while(rowIndex < matrix.length) {
            int firstRowElement = matrix[rowIndex][0];
            int lastRowElement = matrix[rowIndex][matrix[rowIndex].length-1];
            if (target >= firstRowElement && target <= lastRowElement) {
                for(int j = 0; j < matrix[rowIndex].length; j++) {
                    if (target == matrix[rowIndex][j]) {
                        return true;
                    }
                }
                break;
            } else {
                rowIndex++;
            }
        
        }
        return false;
    }
}
