package linkedList;
class LNode{
	int val;
    LNode next;
    LNode back;
    LNode(int val,LNode next, LNode back){
    	this.val = val;
    	this.next = next;
    	this.back = back;
    }
    LNode(int val){
    	this(val,null,null);
    }
}
public class DeleteTailOfNodeDLL {
	
	public static void print(LNode head) {
		if(head == null) {
			System.out.println("null");
		}
		while(head != null) {
			System.out.print(head.val +" > ");
			head = head.next;
		}
		System.out.print("null");
	}
	
	public static LNode deleteTailnode(LNode head) {
		if(head == null || head.next == null) {
			return null;
		}
		LNode tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		
		LNode prev = tail.back;
		tail.back = null;
		prev.next = null;
		return head;
	}
	
	public static LNode convertArr2DLL(int[] arr) {
		if(arr.length==0) {
			return null;
		}
		LNode head = new LNode(arr[0]);
		LNode back = head;
		for(int i = 1;i<arr.length; i++) {
			LNode temp = new LNode(arr[i]);
			back.next = temp;
			temp.back = back;
			back = temp;
		}
		return head;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		LNode head = convertArr2DLL(arr);
	    head = deleteTailnode(head);
	    print(head);
	}
}
