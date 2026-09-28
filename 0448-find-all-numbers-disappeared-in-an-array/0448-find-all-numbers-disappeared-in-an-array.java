class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna