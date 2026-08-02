// Last updated: 8/2/2026, 11:21:06 AM
1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long max = 0;
4        for(int i = 0;i<=nums.length -2;i++){
5            for(int j = i+1;j<nums.length;j++){
6                int gcd = findgcd(nums[i],nums[j]);
7                long tempres = (1L*nums[i] * nums[j] ) / (1L*gcd*gcd);
8                max = Math.max(max,tempres);
9            }
10        }
11        return max;
12    }
13    public static int findgcd(int a, int b){
14            if(a == 0)
15            return b;
16          return findgcd(b % a,a);
17    }
18}