public class maxConsecutiveOnes {
    class Solution {
        public int findMaxConsecutiveOnes(int[]nums) {
            int count = 0;
            int flag = 0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i] == 1){
                    count++;
                    if(count>flag){
                        flag = count;
                    }
                }
                else{
                    count = 0;
                }
            }
            return flag;
        }
    }
    
}
