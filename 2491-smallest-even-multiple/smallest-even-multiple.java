class Solution {
    public int smallestEvenMultiple(int n) {
    // check even
    if (n%2 == 0){
        return n;
    } else{
        return n*2;
    }
    }
}