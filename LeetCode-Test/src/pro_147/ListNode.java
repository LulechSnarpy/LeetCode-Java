package pro_147;

//Problem: Sort a linked list using insertion sort.

 /** Definition for singly-linked list.
  */
 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode insertionSortList(ListNode head) {
    	//MyCode:
    	if(head == null) return head;
    	ListNode h = new ListNode(head.val);
    	ListNode t = head.next;
    	ListNode p = h;
    	while(t!=null){
    		p = h;
    		ListNode k = new ListNode(t.val);
    		if(t.val<p.val){
    			k.next = h;
    			h = k;
    		}else{
    			while(p.next!=null){
    				if(t.val<p.next.val) break;
    				p = p.next;
    			}
    			k.next = p.next;
    			p.next = k;
    		}
    		t = t.next;
    	}
    	return h;
    }
}
