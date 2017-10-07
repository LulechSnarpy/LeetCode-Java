package pro_147;

public class Test {
	public static void main(String[] args) {
		String data = "1 6 4 5";
		Solution s = new Solution();
		ListNode head = new ListNode(9);
		ListNode t = head;
		for(String k:data.split(" ")){
			int x = Integer.parseInt(k);
			ListNode p = new ListNode(x);
			t.next=p;
			t=p;
		}
		show(head);
		head = s.insertionSortList(head);
		show(head);
		
	}
	
	public static void show(ListNode head){
		ListNode t = head;
		while(t!=null){
			System.out.print(t.val+" ");
			t = t.next;
		}
		System.out.println();
	}
}
