package p1_p50.medium.p2AddTwoNumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int val = l1.val + l2.val;
		ListNode sum = new ListNode(val % 10);
		if(l1.next == null) sum.next = l2.next;
		else if(l2.next == null) sum.next = l1.next;
		else sum.next = addTwoNumbers(l1.next, l2.next);
		if(val >= 10) inc(sum);
		return sum;
	}
	
	public void inc(ListNode l) {
		if(l.next == null) {
			l.next = new ListNode(1);
			return;
		}
		if(l.next.val == 9) {
			l.next.val = 0;
			inc(l.next);
		}else {
			l.next.val++;
		}
	}

}
