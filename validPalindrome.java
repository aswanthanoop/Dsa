public class validPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            String fixed_str = "";
    
            for (char c : s.toCharArray()){
                if (Character.isDigit(c) || Character.isLetter(c)){
                    fixed_str += c;
    
                }
            }
            fixed_str = fixed_str.toLowerCase();
    
            int a_point = 0;
            int b_point = fixed_str.length() - 1;
    
            while(a_point <= b_point) {
                if(fixed_str.charAt(a_point) != fixed_str.charAt(b_point)){
                return false;
            }
            
                a_point += 1;
                b_point -= 1;
    
            }
            return true;
        }
    }
    
}
