// Last updated: 10/7/2026, 1:08:16 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        Stack<Character> st = new Stack<>();
4       
5        for(int i = 0; i< s.length();i++){
6           if(s.charAt(i) == ')' && st.size()!= 0){
7            if(st.peek() == '(')
8           st.pop();
9           else 
10           st.push(s.charAt(i));}
11           else
12           st.push(s.charAt(i));
13        }
14        return st.size();
15    }
16}