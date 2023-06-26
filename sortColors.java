//Dutch National Flag problem
public class sortColors {
    class Solution {
        public void swap(int[] nums, int n, int m) {
            int temp = nums[n];
            nums[n] = nums[m];
            nums[m] = temp;
        }
    
        public void sortColors(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;
    
            while (mid <= high) {
                if (nums[mid] == 0) {
                    swap(nums, mid, low);
                    mid++;
                    low++;
                } else if (nums[mid] == 1) {
                    mid++;
                } else {
                    swap(nums, mid, high);
                    high--;
                }
            }
        }
    }
    
}
