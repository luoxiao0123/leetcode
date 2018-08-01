package p1_p50.easy.p21MergeTwoSortedList;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        
        ListNode copy = l;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				copy.next = l1;
				l1 = l1.next;
			}
			else{
				copy.next = l2;
				l2 = l2.next;
			}
			copy = copy.next;
		}
		if(l1 == null) copy.next = l2;
		else copy.next = l1;
		
		return l.next;

    }
}
