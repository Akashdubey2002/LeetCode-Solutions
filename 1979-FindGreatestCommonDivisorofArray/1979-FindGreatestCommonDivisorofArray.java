// Last updated: 7/18/2026, 9:57:26 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int max = 1;
5        for(int i = 1; i<= nums[0];i++){
6            if(nums[0] %i == 0 && nums[nums.length -1] % i == 0)
7            max = Math.max(i,max);
8        }
9        return max;
10        
11       
12        
13    }
14}