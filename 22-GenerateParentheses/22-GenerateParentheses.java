// Last updated: 10/3/2026, 5:38:19 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<String>();
4        StringBuilder sb = new StringBuilder();
5        int open = n, close = n;
6        generateallParenthesis(sb,open,close,res,n);
7        return res;
8    }
9   public void generateallParenthesis(StringBuilder sb,int open,int close,List<String>res, int n){
10        if(sb.length() ==n*2){
11            res.add(sb.toString());
12            // return;
13        }
14        if(open <= close && open > 0){
15            generateallParenthesis(sb.append('('),open-1,close,res,n);
16            sb.deleteCharAt(sb.length() - 1);
17        }
18        if(close > open ){
19            generateallParenthesis(sb.append(')'),open,close-1,res,n);
20            sb.deleteCharAt(sb.length() - 1);
21            }
22        
23
24    }
25
26}