import java.util.ArrayList;
import java.util.List;

public class subSets {
    class Solution {
    private void backtrack(List<List<Integer>>resultSets,List<Integer> tempSet,int[] nums,int start){
        resultSets.add(new ArrayList<>(tempSet));
        for (int i = start; i<nums.length;i++){
            tempSet.add(nums[i]);
            backtrack(resultSets, tempSet, nums, i+1);
            tempSet.remove(tempSet.size() - 1);
        }
        
    }
    public List<List<Integers>> subsets(int[] nums) {
        List<List<Integers>> resultList = new ArrayList<>();
        List<List<Integer>> resultSet;
        backtrack(resultSet, new ArrayList<>(), nums, 0);
        return resultList;

        
    }
}
    
}

// private void backtrack(List<List<Integer>> resultSets,tempSet,int[] nums, int start){
//     resultSets.add(new ArrayList<>(tempSet));
//     for (int i = start;i<nums.length;i++){
//         tempSet.add(nums[i]);
//         backtrack(resultSets,tempSet,nums,i+1);
//         tempSet.remove(tempSet.size() - 1);

//     }
// }
