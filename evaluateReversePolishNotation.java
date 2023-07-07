import java.util.Stack;

public class evaluateReversePolishNotation {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack();
        String str = "+-*/";
        for (String s:tokens){
            if(str.contains(s) && !stack.isEmpty()){
                int v1 = stack.pop();
                int v2 = stack.pop();
                int ans = help(v2,s,v1);
                stack.push(ans);

            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public int help(int v2, String s , int v1){
        if(s.equals("+")) return v2+v1;
        else if(s.equals("-")) return v2-v1;
        
        else if(s.equals("/")) return v2 / v1;
        return v2*v1;
    }
}
