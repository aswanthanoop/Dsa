import java.util.ArrayList;
import java.util.List;

public class insertInterval {
    class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i =0;
        int n = intervals.length;
        while(i<n && intervals[i][1] < newInterval[0]){
            result.add(intervals[i]);
            i++;
        }
        int[] mi = newInterval;
        while(i<n && intervals[i][0] <= newInterval[1]){
            mi[0] = Math.min(mi[0], intervals[i][0]);
            mi[1] = Math.max(mi[1], intervals[i++][1]);
        }
        result.add(mi);

        while(i<n){
            result.add(intervals[i++]);

        }
        return result.toArray(new int[result.size()][2]);
    }
}
    
}
