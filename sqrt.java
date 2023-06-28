public class sqrt {
    class Solution {
        public int mySqrt(int x) {
            if(x<2){
                return x;
            }
            double a = sqrrt(x);
            int b =(int) Math.floor(a);
            return b;
            
        }
        
        
        public static double sqrrt(int n){
            double t;
            double sqrtt = n/2;
            do{
                t = sqrtt;
                sqrtt = (t+(n/t))/2;
    
            }
            while ((t-sqrtt)!= 0);
                return sqrtt;
    
            
        }
    }

//Solution 2
// class Solution {
//     public int mySqrt(int x) {
//         int a = 0;
//         for(long i = 0;i*i<=x;i++){
//             a = (int)i;
//         }
//         return a;
//     }
// }
    
}
