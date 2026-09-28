class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        for(int[] row : image){
        int low = 0;
        int high = n - 1;
        while(low<=high){
            int temp = row[low];
            row[low] = 1 - row[high];
            row[high] = 1 - temp;
            low++;
            high--; 
        }
    }
    return image;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna