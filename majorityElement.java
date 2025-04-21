public class majorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int majority = nums[0];
            int count = 0;
    
            for(int num : nums){
                if (count ==0){
                    majority = num;
                }
                count += (num == majority) ? 1 :-1;
            }
            return majority;
        }
    }
}
.