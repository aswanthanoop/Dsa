public class RichestCustomerWealth {
    class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int rows = accounts.length;
        int cols = accounts[0].length;

        for (int i = 0; i < rows; i++) {
            int wealth = 0;
            for (int j = 0; j < cols; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }
}

    
}
