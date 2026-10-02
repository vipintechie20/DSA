class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");
        return str[str.length-1].length();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna