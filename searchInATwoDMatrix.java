public class searchInATwoDMatrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int length = matrix.length;
            int width = matrix[0].length;
            int left = 0;
            int right = length*width-1;
    
            while(left<=right){
                int mid = left + (right - left)/2;
                int r = mid/width;
                int c = mid % width;
    
                if(matrix[r][c] == target){
                    return true;
                } else if (matrix[r][c] < target){
                    left  = mid + 1;
                } else{
                    right = mid - 1;
                }
            }
            return false;
    
        }
    }
    
    
}
