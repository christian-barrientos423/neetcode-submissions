class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rowIndex = -1;
        int start = 0;
        int end = matrix.length - 1;
        while (start <= end) {
            rowIndex = (start + end)/2;
            
            if (target > matrix[rowIndex][matrix[rowIndex].length-1]) {
                start = rowIndex + 1;
            } else if (target < matrix[rowIndex][0]){
                end = rowIndex - 1;
            } else {
                break;
            }
        }

                System.out.print("ROW INDEX: " + rowIndex);


        start = 0;
        end = matrix[rowIndex].length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[rowIndex][mid] == target) {
                return true;
            } else if (matrix[rowIndex][mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
