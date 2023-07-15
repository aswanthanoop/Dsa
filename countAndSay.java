public class countAndSay {
    class Solution {
        String convert(String s)
        {
            char prevCh = s.charAt(0);
            int prevCount = 1; 
            StringBuilder ans = new StringBuilder();
            for (int i = 1; i < s.length(); i++)
            {
                char currCh = s.charAt(i);
                if (currCh != prevCh)   
                {
                    ans.append(Integer.toString(prevCount));
                    ans.append(prevCh);
                    prevCount = 1; //reset count
                    prevCh = currCh;
                }
                else prevCount++;
            }
            ans.append(Integer.toString(prevCount));
            ans.append(prevCh);
            return ans.toString();
        }
        public String countAndSay(int n) 
        {
            String prevStr = "1";
            for (int i = 2; i <= n; i++)
            {
                String cnsNum = convert(prevStr); 
                prevStr = cnsNum;
            }
            return prevStr;
            
            
        }
    }
    
}
