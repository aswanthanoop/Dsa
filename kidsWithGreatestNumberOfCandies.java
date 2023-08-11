public class kidsWithGreatestNumberOfCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> res = new ArrayList<>();
            boolean flag;
            int size = candies.length;
            int count  = 0;
            for(int i = 0;i<size;i++){
                if(count<candies[i]) count = candies[i];
            }
            System.out.println(count);
    
            
            for(int i = 0;i<size;i++){
    
                if((candies[i] + extraCandies) >= count){
                    flag = true;
                    res.add(flag);
                }
                else{
                    flag = false;
                    res.add(flag);
                }
            }
            return res;
        }
    }
    
}
