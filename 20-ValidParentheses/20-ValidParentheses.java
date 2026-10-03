// Last updated: 10/3/2026, 4:49:13 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char c = s.charAt(i);
6            if((c == ')' || c  == ']' || c == '}')&& st.size() == 0){
7                return false;}
8            else if(c == ')' || c  == ']' || c == '}'){
9                char z = st.peek();
10                if(c == ')' && z=='(')
11                st.pop();
12                else if(c == ']' && z=='[')
13                 st.pop();
14                else if(c == '}' && z == '{')
15                 st.pop();
16                 else
17                 return false;
18            } 
19            else 
20            st.push(c);}
21            
22            if(st.size() == 0)
23            return true;
24            return false;
25        
26    }
27}