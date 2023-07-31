public class finalValueOfVariableAfterPerformingOperations {
    class Solution {
        public int finalValueAfterOperations(String[] operations) {
            int x = 0;
            int size = operations.length;
            for(int i = 0;i<size;i++){
                if(operations[i].equals("X++")  || operations[i].equals("++X")){
                    x+=1;
                }
                if(operations[i].equals("X--") || operations[i].equals("--X")){
                    x-=1;
                }
            }
            return x;
        }
    }
    
}
