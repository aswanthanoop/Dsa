import java.util.Arrays;

public class multiplyStrings {
    class Solution {
    public String multiply(String num1, String num2) {
        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();
        int n1 = ch1.length;
        int n2 = ch2.length;
        char[] res = new char[n1 + n2];
        Arrays.fill(res,'0');

        for(int j = n2 - 1;j>=0;j--){
            for(int i = n1 - 1;i>=0;i--){
                int product = (ch1[i] - '0')* (ch2[j] - '0');
                int temp = res[i+j+1] - '0' + product;
                res[i+j+1] = (char) (temp%10 + '0');
                res[i+j] = (char) ((res[i+j] - '0' + temp / 10) + '0');

            }
        }
        StringBuilder sb = new StringBuilder();
        boolean seen = false;
        for(char c : res){
            if(c == '0' && !seen) continue;
            sb.append(c);
            seen = true;
        }
        return sb.length() == 0 ? "0" : sb.toString();

        
    }
}
}
