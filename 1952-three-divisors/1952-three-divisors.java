class Solution {
    public boolean isThree(int n) {
        int div =0;
        for(int i = 2;i < n; i++){
            if(n % i == 0){
                div ++;
            }
        }
        if(div == 1){
            return  true;
        }
        else{
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna