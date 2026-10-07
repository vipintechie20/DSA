# [Column with Max 0s](https://www.geeksforgeeks.org/problems/predict-the-column/1)
## Easy
You are given a matrix mat[][] of size&nbsp;n ×&nbsp;n consisting only of 0s and 1s. Your task is to find the index of the column that contains the maximum number of 0s.
If more than one column has the same maximum number of 0s, return the index of the leftmost such column.
If no column contains any 0 (i.e., all elements in the matrix are 1), return -1.
Examples:
Input: mat[][] = [[0, 0, 0],
                [1, 0, 1],
                [0, 1, 1]]
Output: 0
Explanation: Columns 0 and 1 contain the same number of 0s; however, column 0 appears first, so the answer is 0.
Input: mat[][] = [[1, 1, 1],
                [1, 1, 1],
                [1, 1, 1]]
Output: -1
Explanation: Since no column contains any 0s, the answer is -1.
Constraints:1 ≤ n ≤ 1030 ≤ mat[i][j] ≤ 1