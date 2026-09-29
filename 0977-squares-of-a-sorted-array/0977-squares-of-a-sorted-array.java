class Solution {
    public int[] sortedSquares(int[] nums) {

//         for(int i = 0; i < nums.length; i++){
//             nums[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
        int n = nums.length;
        int[] ans = new int[n];
        int low = 0;
        int high = n - 1;
        while(low<=high){
            int leftV = nums[low]*nums[low];
            int rightV = nums[high]*nums[high];
            if(leftV > rightV){
                ans[n-1] = leftV;
                low++;
                n--;
            }else{
                ans[n-1] = rightV;
                n--;
                high--;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna