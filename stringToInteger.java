public class stringToInteger {
    class Solution{
        public int ayAtoi(String s){
            int i = 0;
            s = s.trim();
            int n = s.length();

            int positive = 0;
            int negative = 0;
            if(n>0){
                if(s.charAt(0) == '+'){
                    positive++;
                    i++;
                }
                if(s.charAt(0) == '-'){
                    negative++;
                    i++;
                }
            }
            int ans = 0;

            while(i<n && s.charAt(i) >= '0' && s.charAt(i)<= '9'){
                ans = ans*10 + (s.charAt(i) - '0');
                i++;
            }
            if(negative > 0){
                ans = ans* -1;

            }
            return (int) ans;
        }
        
    }
    
}
