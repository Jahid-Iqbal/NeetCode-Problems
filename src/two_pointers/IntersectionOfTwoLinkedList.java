package two_pointers;

public class IntersectionOfTwoLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            next = null;
        }
    }

    //My solution
    /*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA, listB = headB;
        int countA = 0, countB=0;

        while (listA != null){
            countA++;
            listA = listA.next;
        }
        while (listB != null){
            countB++;
            listB = listB.next;
        }
        while (countA > countB){
            headA = headA.next;
            countA--;
        }
        while (countB > countA){
            headB = headB.next;
            countB--;
        }
        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
            if (headA == headB){
                return headA;
            }
        }
        return null;
    }*/

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Initialize two pointers starting at the heads of both lists
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        // Continue traversing until both pointers meet (either at intersection or both null)
        while (pointerA != pointerB) {
            // If pointerA reaches the end of list A, redirect it to the head of list B
            // Otherwise, move to the next node in the current list
            pointerA = (pointerA == null) ? headB : pointerA.next;

            // If pointerB reaches the end of list B, redirect it to the head of list A
            // Otherwise, move to the next node in the current list
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // Return the meeting point (intersection node or null if no intersection)
        return pointerA;
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n11 = new ListNode(1);
        ListNode n4 = new ListNode(4);
        ListNode n44 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n55 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n8 = new ListNode(8);

        n4.next = n1;
        n1.next = n8;
        n8.next = n44;
        n44.next = n5;
        n55.next = n6;
        n6.next = n11;
        n11.next = n8;



        System.out.println(new IntersectionOfTwoLinkedList().getIntersectionNode(n4, n55).val);



    }

}
