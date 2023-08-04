public class sumOfAllOddLengthSubArrays {
    class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length,result = 0,start,end,total,odd;

        for(int i = 0; i < n; i++) {
            end = i + 1;     
            start = n - i; 
            total = end * start;
            odd = total / 2;    
            if(total % 2 != 0)      
                odd++;                    
            result += odd * arr[i]; 
        }
        return result;
    }
}
    
}
