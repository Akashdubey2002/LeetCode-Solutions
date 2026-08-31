// Last updated: 9/1/2026, 1:08:21 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        if(head == null || head.next == null || head.next.next == null)
14        return new int[]{-1,-1};
15
16        ListNode prev = head, curr = head.next;
17        int counter = 2, minimum = Integer.MAX_VALUE;
18int first_point = Integer.MAX_VALUE, second_point = 0,third_point = 0;
19while(curr.next != null ){
20    if((prev.val > curr.val && curr.val < curr.next.val)|| (prev.val < curr.val && curr.val > curr.next.val)){
21        if (first_point == Integer.MAX_VALUE) {
22    first_point = counter;
23    second_point = counter;
24}
25else if (third_point == 0) {
26    third_point = counter;
27}
28else {
29    second_point = third_point;
30    third_point = counter;
31}
32
33if (third_point != 0) {
34    minimum = Math.min(minimum, third_point - second_point);
35}}
36    counter++;
37    prev = curr;
38    curr = curr.next;
39
40}
41if(third_point == 0)
42return new int[]{-1,-1};
43return new int[]{minimum, third_point - first_point};
44
45    }
46}