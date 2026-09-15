// Last updated: 15/09/2026, 16:30:50
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
12    public ListNode swapPairs(ListNode head) {
13        ListNode dummy = new ListNode(0,head);
14        ListNode prev = dummy,cur = head;
15        while(cur != null && cur.next != null){
16            ListNode npn = cur.next.next;
17            ListNode second=cur.next;
18            second.next = cur;
19            cur.next = npn;
20            prev.next = second;
21
22            prev = cur;
23            cur = npn;
24        }
25        
26        return dummy.next; 
27    }
28}