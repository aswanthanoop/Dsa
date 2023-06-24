public class ThreeSumClosest {
    class Solution {
        public int threeSumClosest(int[] arr, int target) {
            Arrays.sort(arr);
            int resultSum = arr[0] + arr[1] + arr[2];
            int minDifference = Integer.MAX_VALUE;
    
            for(int i = 0; i < arr.length-2;i++){
                int left = i + 1;
                int right = arr.length - 1;
    
                while (left < right){
                    int sum = arr[i] + arr[left] + arr[right];
    
                    if (sum == target){
                        return target;
                    }
                    if (sum < target){
                        left ++;
                    }
                    else {
                        right --;
                    }
                    int diffToTarget = Math.abs(sum - target);
                    if(diffToTarget < minDifference) {
                        resultSum = sum;
                        minDifference = diffToTarget;
                    }
                }
            }
            return resultSum;
        }
    }
    
}
