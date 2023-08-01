public class leftAmdRightSumDifferences {
    class Solution {
        public int[] leftRightDifference(int[] nums) {
            int n = nums.length;
            int[] leftsum = new int[n];
            int[] rightsum = new int[n];
    
            int count  = 0;
            
            for(int i = 0;i<n-1;i++){
                count+= nums[i];
                leftsum[i+1] = count;
                
            }
            int count2 = 0;
            for(int i = n-1;i>0;i--){
                count2+= nums[i];
                rightsum[i-1] = count2;
                
            }
    
            // for(int i=0,a=0;i<n;i++){
            //     for(int j=i+1;j<n;j++){
            //         rightsum[i] += nums[j];
            //     }
            // }
            int[] res = new int[n];
            for(int i = 0;i<leftsum.length;i++){
                res[i] = Math.abs(leftsum[i] - rightsum[i]);
            }
    
            return res;
    
        }
    }

}
