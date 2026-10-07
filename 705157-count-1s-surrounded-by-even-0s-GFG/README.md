# [Count 1s Surrounded by Even 0s](https://www.geeksforgeeks.org/problems/surround-the-1s2505/1?)
## Easy
Given a binary matrix matrix[][] containing only 0s and 1s, count cells containing 1 and have a positive even number of surrounding 0s.

For each cell (except on boundary), there are 8 surrounding cells, directly above, below, left, right, and the four diagonal cells.&nbsp;
The cells on boundary have less surrounding cells as cells outside matrix are not considered. 

Examples:
Input: matrix[][] = [[1, 0, 0], [1, 1, 0], [0, 1, 0]]
Output: 1
Explanation: The 1 at position (1, 0) has 2 surrounding 0s, which is a positive even number, so it is counted.The other 1s have 1, 5, and 3 surrounding 0s respectively, all of which are odd. Hence, the total count is 1.
Input: matrix[][] = [[1]]
Output: 0
Explanation: The matrix contains only one cell, so it has no surrounding cells and therefore has 0 surrounding 0s. Since at least one surrounding 0 is required, this 1 is not counted.
Input: matrix[][] = [[0, 0, 0], [0, 1, 0], [0, 0, 0]]
Output: 1
Explanation: The 1 at position (1, 1) has 8 surrounding cells, and all 8 are 0s. Since 8 is a positive even number, this 1 is counted. Hence, the answer is 1.
