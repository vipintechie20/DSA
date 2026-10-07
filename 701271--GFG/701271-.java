class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        // first top row
        for (int j = 0; j < m; j++) {
            ans.add(mat[0][j]);
        }

        // right col
        for (int i = 1; i < n; i++) {
            ans.add(mat[i][m - 1]);
        }

        // bottom row
        // Only if there is more than one row
        if (n > 1) {
            for (int j = m - 2; j >= 0; j--) {
                ans.add(mat[n - 1][j]);
            }
        }

        // left col
        // Only if there is more than one column
        if (m > 1) {
            for (int i = n - 2; i >= 1; i--) {
                ans.add(mat[i][0]);
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna