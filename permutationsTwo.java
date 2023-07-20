import java.util.ArrayList;
import java.util.List;

public class permutationsTwo {
    class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,nums,0);
        return result;

        

    }
    public List<Integer> toList(int[] nums){
        List<Integer> l = new ArrayList<>();
        for(int i : nums){
            l.add(i);
        }
        return l;
    }
    public void backtrack(List<List<Integer>> result, int[] nums,int start){
        if(start == nums.length){
            result.add(toList(nums));

        } else{
            for(int i = start;i<nums.length;i++){
                if(i != start && !canPermutate(start,i,nums)) continue;
                swap(start,i,nums);
                backtrack(result,nums,start+1);
                swap(start,i,nums);
            }
        }

    }
    public void swap(int i, int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
    public boolean canPermutate(int start, int curr,int[] nums){
        for(int i = start;i<curr;i++){
            if(nums[i] == nums[curr]){
                return false;
            }
        }
        return true;
    }
}
    
}
