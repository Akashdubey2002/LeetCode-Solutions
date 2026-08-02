// Last updated: 8/2/2026, 11:46:58 AM
1class Solution {
2    public int countRatioSubarrays(int[] nums, int a, int b) {
3
4        int subarrays = 0;
5        double ratio = (double) a / b;
6
7        for (int i = 0; i < nums.length; i++) {
8
9            int odd = 0, even = 0;
10
11            for (int j = i; j < nums.length; j++) {
12
13                if (nums[j] % 2 == 0)
14                    even++;
15                else
16                    odd++;
17
18                if (odd > 0 && (double) even / odd <= ratio)
19                    subarrays++;
20            }
21        }
22
23        return subarrays;
24    }
25}