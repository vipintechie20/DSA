# [Summed Matrix](https://www.geeksforgeeks.org/problems/summed-matrix5834/1)
## Easy
Given two integers n and q, consider a n * n matrix where the value at cell (i, j) is i + j, with both row and column indices starting from 1. Return the number of cells whose value is equal to q. 
Note: The matrix uses 1-based indexing.
Examples:
Input: n = 4, q = 7
Output: 2
Explanation: Matrix becomes
2 3 4 5 
3 4 5 6 
4 5 6 7
5 6 7 8
The count of 7 is 2.
Input: n = 5, q = 4
Output: 3
Explanation: Matrix becomes
2 3 4 5 6&nbsp;
3 4 5 6 7&nbsp;
4 5 6 7 8&nbsp;
5 6 7 8 9&nbsp;
6 7 8 9 10&nbsp;
The count of 4 is 3.