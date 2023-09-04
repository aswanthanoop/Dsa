public class truncateSentence {
    class Solution {
        public String truncateSentence(String s, int k) {
            int count  = 0;
            int a = 1;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == ' ') count++;
                if(count == k) break;
                a = i;
            }
            if(a == s.length()) return s;
            return s.substring(0,a+1);
        }
    }
    
}
