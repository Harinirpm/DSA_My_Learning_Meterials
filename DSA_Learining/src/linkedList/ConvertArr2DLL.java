package linkedList;
import java.util.*;

class ListNode{
	int val;
	ListNode next;
	ListNode prev;
	ListNode(int val, ListNode next, ListNode prev){
		this.val = val;
		this.next = next;
		this.prev = prev;
	}
	
	ListNode(int val){
		this.val = val;
		this.prev = null;
		this.next = null;
	}
}
public class ConvertArr2DLL {
	static void print(ListNode head) {
		while(head!=null) {
			System.out.print(head.val+" -> ");
			head = head.next;
		}
	}
	
	static ListNode convertArrtoDLL(int[] arr) {
		ListNode head = new ListNode(arr[0]);
		ListNode prev = head;
		for(int i = 1;i<arr.length;i++) {
			ListNode temp = new ListNode(arr[i]);
			prev.next = temp;
			prev = temp;
		}
		return head;
	}
  public static void main(String[] args) {
	  int[] arr = {1,2,3,4,5};
	  ListNode head = convertArrtoDLL(arr);
	  print(head);
  }
}
