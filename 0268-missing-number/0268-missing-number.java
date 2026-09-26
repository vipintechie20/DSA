class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int val:nums){
            sum = sum + val;
        }
        int n = nums.length;
        int totalsum = (n*(n+1))/2;
        return totalsum-sum;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna