import java.util.Arrays;

public class countPrimes {
    // Approach 1
    class Solution {
        public int countPrimes(int n) {
          int count = 0;
          for(int i = 2;i<n;i++){
            if(isPrime(i)){
              count++;
              System.out.println(i);
            }
          }
          return count;
    
            
        }
        public static boolean isPrime(int n){
          for(int i = (n-1);i>1;i--){
            if(n%i  == 0) {
              return false;
    
            } else{
              continue;
            }
          }
          return true;
        }
    }


    // Approach 2
    class Solution2 {
        public int countPrimes(int n) {
          int count = 0;
          for(int i = 2;i<n;i++){
            if(isPrime(i)){
              count++;
              System.out.println(i);
            }
          }
          return count;
    
            
        }
        public static boolean isPrime(int n){
          if(n<=1){
            return false;
          }
          if(n<=3){
            return true;
          }
          if(n%2 == 0 || n%3 == 0){
            return false;
          }
          for(int i = 5;i*i <=n ; i = i+6){
            if(n%i == 0 || n%(i+2) == 0){
              return false;
            }
          }
          return true;
          
        }
    }

    // Approach 3
    class Solution3 {
    public int countPrimes(int n) {
        if(n<2){
          return 0;
        }
        boolean[] primes = new boolean[n];
        Arrays.fill(primes,true);

        int count = 0;
        for(int i = 2;i<n;i++){
          if(primes[i]){
            count++;
            if((long)i*i<n){
              for(int j = i*i;j<n;j+=i){
                primes[j] = false;
              }
            }
          }
        }
      return count;
    }
}
    
}
