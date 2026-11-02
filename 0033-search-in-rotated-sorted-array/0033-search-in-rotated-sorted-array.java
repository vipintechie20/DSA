class Solution {
    public int search(int[] nums, int target) {
      for(int i=0; i<nums.length; i++){
        if(nums[i] == target) return i;
      }  
      return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna