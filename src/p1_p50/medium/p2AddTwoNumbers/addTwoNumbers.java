package p1_p50.medium.p2AddTwoNumbers;

public class addTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode a = new ListNode(9);
		a.next = new ListNode(1);
		ListNode b = new ListNode(8);
		b.next = new ListNode(8);
		ListNode sum = s.addTwoNumbers(a, b);
		ListNode i = sum;
		while(i != null) {
			System.out.println(i.val);
			i = i.next;
		}

	}

}
