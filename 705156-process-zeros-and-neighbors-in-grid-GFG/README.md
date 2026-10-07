# [Process Zeros and Neighbors in Grid](https://www.geeksforgeeks.org/problems/make-zeroes4042/1)
## Easy
Given a matrix mat[][] of&nbsp; size n x m. Your task is to process Zeroes, that means in whole matrix when you find a zero, change that element to sum of the upper, lower, left and right value and make its four adjacent (upper, lower, left, and right) values zero.
Examples:
Input: mat[][] = [[1, 2, 3, 4]
                [5, 6, 0, 7] 
&nbsp;               [8, 9, 4, 6]
                [8, 4, 5, 2]]
Output: mat[][] = [[1, 2, 0, 4]
&nbsp;                [5, 0, 20, 0]
                 [8, 9, 0, 6] 
&nbsp;                [8, 4, 5, 2]]
Explanation: As mat[1][2] = 0, we will perform the operation here. Then mat[1][2] = mat[0][2] + mat[2][2] + mat[1][1]  + mat[1][3] and mat[0][2] = matrix[2][2] = matrix[1][1] = matrix[1][3] = 0.

Input: mat[][] = [[1, 2] 
&nbsp;               [3, 4]]
output: mat[][] = [[1, 2] 
&nbsp;                [3, 4]]&nbsp;&nbsp;
Constraints:1 ≤ n, m ≤ 1000 ≤ mat[i][j] ≤ 100, where 0 ≤ i ≤ n and 0 ≤ j ≤ m