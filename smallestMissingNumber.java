import java.util.Arrays;

public class smallestMissingNumber {
    class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int missingNumber = 1;
        Arrays.sort(nums);
        for(int number : nums){
            if(number > 0) {
                if(number == missingNumber){
                    missingNumber++;
                }
                else if( number > missingNumber){
                    break;
                }
            }
            
        }
        return missingNumber;
    }
}
}
