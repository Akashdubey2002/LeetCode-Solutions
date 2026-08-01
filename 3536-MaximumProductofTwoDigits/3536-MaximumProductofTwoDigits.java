// Last updated: 8/1/2026, 2:56:31 PM
1class Solution {
2    public int maxProduct(int n) {
3        String s = Integer.toString(n);
4        char arr[] = s.toCharArray();
5        Arrays.sort(arr);
6        int a = arr[arr.length-1] - '0';
7        int b = arr[arr.length -2] - '0';
8        return (a*b);
9    }
10}