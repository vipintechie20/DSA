class Solution {

	void makeZeros(int[][] mat) {

		int n = mat.length;
		int m = mat[0].length;

		// Copy of original matrix
		int[][] original = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				original[i][j] = mat[i][j];
			}
		}

		// Process original zeroes
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				if (original[i][j] != 0) {
					continue;
				}

				int sum = 0;
				//top
				if (i - 1 >= 0) {
					sum += original[i - 1][j];
				}
				//bottom
				if (i + 1 < n) {
					sum += original[i + 1][j];
				}
				//left
				if (j - 1 >= 0) {
					sum += original[i][j - 1];
				}
				//right
				if (j + 1 < m) {
					sum += original[i][j + 1];
				}

				mat[i][j] = sum;

				if (i - 1 >= 0) {
					mat[i - 1][j] = 0;
				}

				if (i + 1 < n) {
					mat[i + 1][j] = 0;
				}

				if (j - 1 >= 0) {
					mat[i][j - 1] = 0;
				}

				if (j + 1 < m) {
					mat[i][j + 1] = 0;
				}
			}
		}
	}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna