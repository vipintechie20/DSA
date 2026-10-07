class Solution {
    public int maxZeros(int[][] arr) {
        // code here
        int ans=-1;
        int n=arr.length;
        int maxZeros = 0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j][i]==0){
                    count++;
                }
            }
            if(count > maxZeros) {
                maxZeros = count;
                ans = i;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna