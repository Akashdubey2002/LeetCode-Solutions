// Last updated: 10/11/2026, 5:23:21 PM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int len = nums.length;
4        int res = 0;
5        for(int i = 0; i< nums.length;i++){
6            if(len % (i+1) == 0)
7res+= nums[i] * nums[i]; 
8        }
9        return res;
10    }
11}