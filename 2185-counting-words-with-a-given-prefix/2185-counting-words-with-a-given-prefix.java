class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word: words){
            if(word.startsWith(pref))
            count ++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna