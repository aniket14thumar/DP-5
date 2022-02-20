// Time Complexity : O(n^3); where m - number of rows and n = number of columns
// Space Complexity : O(n) where n = length of the string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        
        // represents a string before it can be split or not
        boolean [] dp = new boolean[s.length() + 1];
        
        // empty string is assumed to be split
        dp[0] = true;
        
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < i; j++){
                // check if string before the current element can be split 
                // and the remaining substring is present in the dictionary
                if(dp[j] && set.contains(s.substring(j,i))){
                    // mark it as true and don't check for the remaining substring
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[dp.length - 1];
    }
}