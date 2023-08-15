public class runningSumOfOneDArray {
    class Solution {
        public int[] runningSum(int[] nums) {
            int size = nums.length;
            int[] res = new int[size];
            int count = 0;
            for(int i = 0;i<size;i++){
                count+= nums[i];
                res[i] = count;
            }
            return res;
        }
    }
    
}
