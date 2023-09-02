public class findPeakElement {
    class Solution {
        public int findPeakElement(int[] nums) {
            int size = nums.length;
            if(size == 1 || nums[0] > nums[1]) return 0;
            if(nums[size - 1 ]> nums[size - 2]) return (size -1);
    
            int left = 0;
            int right = size - 1;
    
            while(left<=right){
                int middle = (left + right)/2;
                System.out.println(middle);
    
                int minus = middle == 0 ? Integer.MIN_VALUE : nums[middle - 1];
                int plus = middle == (size - 1) ? Integer.MIN_VALUE : nums[middle + 1];
                if(minus < nums[middle] && plus < nums[middle]) return middle;
    
                if(minus< nums[middle]) left = middle + 1;
                else right = middle - 1;
            }
            return left;
    
        }
    }
}
