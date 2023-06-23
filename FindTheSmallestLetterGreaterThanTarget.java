public class FindTheSmallestLetterGreaterThanTarget {
    class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if(letters[n-1] <= target || letters[0]> target){
            return letters[0];

        }
        int l = 0;
        int r = n - 1 ;
       

        while(l+1 < r){
            int mid = l+(r-l)/2;
            if(letters[mid]<=target){
                l = mid;
            }
            else {
                r = mid;
            }
        }
    
        return letters[r] ;
    }        
}
    
}
