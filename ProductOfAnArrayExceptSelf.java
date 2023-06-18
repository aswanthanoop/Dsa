public class ProductOfAnArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            int[] answer = new int[n];
            prefix[0] = 1;
            suffix[n-1]=1;
    
            for(int i=1;i<n;i++){
                prefix[i]= nums[i-1]*prefix[i-1];
        
            }
            for(int i=n-2;i>=0;i--){
                suffix[i]=nums[i+1]*suffix[i+1];
            }
    
            for (int i=0;i<n;i++){
                answer[i] = prefix[i]*suffix[i];
    
            }
            return answer;
        }
    }
    
}
