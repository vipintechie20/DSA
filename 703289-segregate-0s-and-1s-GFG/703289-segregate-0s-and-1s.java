class Solution {
    void segregate0and1(int[] arr) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int val:arr){
            if(val == 0){
                red++;
            }else {
                white++;
            }
        }
        int p = 0;
        while(red!=0){
            arr[p] = 0;
            p++;
            red--;
        }while(white!=0){
            arr[p] = 1;
            p++;
            white--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna