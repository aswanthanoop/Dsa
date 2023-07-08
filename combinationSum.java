import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findCombinations(0,candidates,target,res,new ArrayList<>());
        return res;
        

    }
    private void findCombinations(int ind, int[] arr, int target,List<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombinations(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind+1,arr,target,ans,ds);
    }
}
    
}
