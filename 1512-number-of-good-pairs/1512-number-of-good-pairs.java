class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0; i < n -1 ; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna