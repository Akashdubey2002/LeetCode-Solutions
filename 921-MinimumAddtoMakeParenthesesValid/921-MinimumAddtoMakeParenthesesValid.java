// Last updated: 10/7/2026, 1:09:30 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        Stack<Character> st = new Stack<>();
4       
5        for(int i = 0; i< s.length();i++){
6           if(s.charAt(i) == ')' && st.size()!= 0 &&st.peek() == '(' ){
7         st.pop();}
8           else
9           st.push(s.charAt(i));
10        }
11        return st.size();
12    }
13}