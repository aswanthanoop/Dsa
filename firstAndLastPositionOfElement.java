public class firstAndLastPositionOfElement {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int n = nums.length;
            int[] result = new int[2];
            int left = -1;
            int right = -1;
    
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    left = i;
                    break;
                }
            }
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[j] == target) {
                    right = j;
                    break;
                }
            }
    
            result[0] = left;
            result[1] = right;
    
            return result;
        }
    }
    
}
