// Last updated: 11/08/2026, 16:03:45
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
       
    }
}