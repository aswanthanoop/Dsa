public class jumpGame {
    class Solution{
        public boolean jump(int[] nums){
            int n = nums.length-1;
            int lastGood = n;
            for(int i = n;i>=0;i--){
                if(i + nums[i]>=lastGood){
                    lastGood = i;
                }
            }
            return lastGood == 0;

            
        }
    }
    
}
