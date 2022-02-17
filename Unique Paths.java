// Time Complexity : O(m*n); where m - number of rows and n = number of columns
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 && n == 0) return 0;
        int [] dp = new int [n];
        
        // Fill last row with 1
        Arrays.fill(dp, 1);
        
        // Fill from second last row 
        for(int i = m - 2; i >= 0; i--){
            // Fill from second last column element
            for(int j = n - 2; j >= 0; j--){
                dp[j] = dp[j] + dp[j + 1];
            }
        }
        return dp[0];
    }
}




// Time Complexity : O(m*n); where m - number of rows and n = number of columns
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 0 && n == 0) return 0;
        int [][] dp = new int [m + 1][n + 1];
        for(int i = m - 1; i >= 0; i--){
            for(int j = n -1; j >= 0; j--){
            
                if(i == m - 1 && j == n-1){
                    dp[i][j] = 1;
                } else{
                    dp[i][j] = dp[i][j + 1] + dp[i + 1][j];                    
                }
            }
        }
        // for(int i = 0; i <= m - 1; i++){
        //     for(int j = 0; j <= n - 1; j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        return dp[0][0];      
    }
}