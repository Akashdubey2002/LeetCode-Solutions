// Last updated: 8/15/2026, 11:02:25 AM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3     boolean isallzero = true;
4      int xOr = 0;
5      for(int i = 0; i<nums.length;i++){
6        xOr^=nums[i];
7         if(nums[i] == 0 && isallzero == true)
8         isallzero = true;
9         else
10            isallzero = false;
11      }
12    //   xOr^= nums[nums.length-1];
13    if(isallzero == true)
14    return 0;
15     else if(xOr == 0)
16     return nums.length -1;
17     else 
18     return nums.length;
19    }
20}