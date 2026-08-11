// Last updated: 11/08/2026, 16:05:18
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode lista = headA;
        ListNode listb = headB;
        while (lista != listb) {
            lista = (lista != null) ? lista.next : headB;
            listb = (listb != null) ? listb.next : headA;
        }
        return lista; 
    }
}