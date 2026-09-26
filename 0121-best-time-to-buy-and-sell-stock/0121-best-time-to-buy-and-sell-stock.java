class Solution {
    public int maxProfit(int[] prices) {
       int buy = Integer.MAX_VALUE;
       int ans = 0;
       for(int val:prices){
        if(val<buy){
            buy = val;
        }
        ans = Math.max(ans,val-buy);
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna