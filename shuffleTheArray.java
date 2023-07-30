import java.util.Arrays;

public class shuffleTheArray {
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size  = nums.length;
        int[] ar1 = new int[n];
        int[] ar2 = new int[n];
        int[] res = new int[size];
        ar1 = Arrays.copyOfRange(nums,0,n);
        ar2 = Arrays.copyOfRange(nums,n,size);

        for(int i = 0;i<n;i++){
            res[2*i] = ar1[i];
            res[2*i + 1] = ar2[i];
        }
        return res;
    }
}


    
}
