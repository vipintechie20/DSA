class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int one = 1;
        int two = 2;
        for(int i = 3;i <= n;i++){
            int curr = one + two;
            one = two;
            two = curr;
        }
        return two;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna