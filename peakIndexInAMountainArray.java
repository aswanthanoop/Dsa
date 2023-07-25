public class peakIndexInAMountainArray {
    
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 1;
        int right = n - 2;
        int res = -1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                res = mid;
                break; 
            } else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}


    
}
