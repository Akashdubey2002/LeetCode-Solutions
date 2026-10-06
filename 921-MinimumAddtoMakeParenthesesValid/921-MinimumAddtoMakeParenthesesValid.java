// Last updated: 10/7/2026, 1:25:20 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3       int res = 0, open = 0, close =0;
4       for(int i = 0; i< s.length();i++){
5        char c = s.charAt(i);
6        if(c == '(')
7        open++;
8        else {
9            if(open == 0)
10            res++;
11            else
12            open--;
13        }
14       }
15       return res+open;
16
17    }
18}