import java.util.*;
public class happyNumber {
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> visited = new HashSet();
            return Happy(n,visited);
    
        }
        public boolean Happy(int n, Set<Integer> visited){
            int sum = 0;
            if(visited.contains(n)){
                return false;
            }
            visited.add(n);
            while(n>0){
                sum+= Math.pow(n%10,2);
                n/=10;
            }
            if(sum == 1){
                return true;
            }
            return Happy(sum,visited);
        }
    }
    
}
