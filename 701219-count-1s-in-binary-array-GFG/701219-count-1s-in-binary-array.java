class Solution {
    public int countOnes(int[] arr) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low<=high){
            mid = low+(high-low)/2;
            if(arr[mid]==0) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna