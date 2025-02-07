package linkedList;
import java.util.*;

class Node{
	int data;
	Node next;
	Node back;
	Node(int data, Node next, Node back){
		this.data = data;
		this.next = next;
		this.back = back;
	}
	Node(int data){
		this(data,null,null);
	}
	
}


public class DeleteHeadOfNodeDLL {
	
	public static void print(Node head) {
		while(head!=null) {
			System.out.print(head.data + " ->");
			head = head.next;
		}
		System.out.println("null");
	}
	
	public static Node deleteHead(Node head) {
		if(head == null) {
			return null;
		}
		Node prev = head.next;
		if(prev.next != null) {
			prev.back=null;
		}
		head.next = null;
		
		return prev;
	}
	public static Node convertArr2DLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node back = head;
		for(int i = 1;i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			temp.back = back;
			back.next = temp;
			back = temp;
		}
		return head;
	}
    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5};
    	Node head = convertArr2DLL(arr);
    	head = deleteHead(head);
    	print(head);
    }
}

