public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
 if (headA == null || headB == null) return null;
 int lenA = 0, lenB = 0;
 ListNode currentA = headA;
 ListNode currentB = headB;

 // Find the length of both lists
 while (currentA != null) {
 lenA++;
 currentA = currentA.next;
 }
 while (currentB != null) {
 lenB++;
 currentB = currentB.next;
 }

 int diff = Math.abs(lenA - lenB);

 // Move the longer list ahead
 if (lenA > lenB) {
 for (int i = 0; i < diff; ++i) headA = headA.next;
 } else {
 for (int i = 0; i < diff; ++i) headB = headB.next;
 }

 // Find the intersection point, if any
 while (headA != null && headB != null && headA != headB) {
 headA = headA.next;
 headB = headB.next;
 }
 return headA == null ? null : headA;
}
    }