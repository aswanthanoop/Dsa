public class shortestUnsortedCoutinousSubArray {
    class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int end = -2 , max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
            if(nums[i] < max){
                end = i;
            }
        }

        int begin = -1 , min = Integer.MAX_VALUE;

        for(int i = nums.length - 1; i >= 0; i--){
            min = Math.min(min,nums[i]);
            if(nums[i] > min){
                begin = i;
            }
        }
        return end - begin + 1;
    }
}
    
}
