import java.util.*;
public class containsDuplicate2 {
    class Soultion{
        public boolean duplicate(int[] nums, int k){
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i = 0;i<nums.length;i++){
                if(!hm.containsKey(nums[i])){
                    hm.put(nums[i],i);
                }
                else{
                    int pastIndex = hm.get(nums[i]);
                    if(Math.abs(pastIndex-i)<= k){
                        return true;
                    }
                    else{
                        hm.put(nums[i],i);
                    }
                }
            }
            return false;
        }
        
    }
}
    

