import java.util.ArrayList;
import java.util.List;

public class generateParenthisis {
    class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList();
        backtrack(output_arr,"",0,0,n);
        return output_arr;

    }
    public void backtrack(List<String> output_arr,String current,  int open, int close,int max){
        if(current.length() == max*2){
            output_arr.add(current);
            return;
        }
        if(open<max) backtrack(output_arr,current +"(",open + 1,close,max);
        if(close<open) backtrack(output_arr,current +")",open,close+1,max);

    }
}
}
