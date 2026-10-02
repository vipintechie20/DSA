class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        for(String str: words){
            int count = 0;
            for(char ch: str.toCharArray()){
                if(ch == x){
                    count++;
                }
            }
            if(count>0){
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna