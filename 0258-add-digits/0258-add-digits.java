class Solution {
    public int addDigits(int num) {
        if(num == 0)
        return 0;
        if(num % 9 == 0)
        return 9;
        return num % 9;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna