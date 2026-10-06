// Last updated: 10/7/2026, 2:12:26 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3      HashMap<Integer,Integer> map = new HashMap<>();
4      int count = Math.round(nums.length / 2);
5      for(int i = 0; i< nums.length;i++){
6        if (map.containsKey(nums[i]) && map.get(nums[i]) >= count) {
7
8            return nums[i];
9        }
10        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
11      }
12return nums[0];
13
14    }
15}