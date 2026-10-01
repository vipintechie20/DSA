class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int low = 1;
        int high = 0;
        for(int val:piles){
            high = Math.max(high, val);
        }while(low<=high){
            int mid = low + (high-low)/2;
            if(possible(piles, h, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public boolean possible(int[] piles, int h, int k){
        long hours = 0;
        for(int pile: piles){
            hours += (pile + k - 1)/k;
            if(h < hours){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna