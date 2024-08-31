package linkedList;

public class CustomLinekedList {
  private Node head;
  private Node tail;
  private int size;
  
  
  public CustomLinekedList() {
	  this.size=0;
  }
  
  class Node{
	  private int value;
	  private Node next;
   
	 public Node(int value){
		  this.value=value;
	  }
	 public Node (int value, Node next) {
		 this.value=value;
		 this.next=next;
	 }
  }
	 public void insert(int value) {
		 Node node = new Node(value);
		 node.next=head;
		 head = node;
		 if(tail==null) {
			 tail=head;
		 }
		 size++;
	 }
	 
	 public void remove(int value) {
		 if(head==null) {
			 System.out.print("There is No element!");
			 return;
		 }
		 if(head.value==value) {
			 head=head.next;
			 return;
		 }
		 
		 Node temp=head;
		 Node prev = null;
		 while(temp!=null) {
			 if(temp.value==value) {
				 prev.next=temp.next;	
				 return;
			 }
			 prev=temp;
			 temp=temp.next;
		 }
		 System.out.print("value not found");
	 }
	 
	 public void display() {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.value+"->");
			 temp=temp.next;
		 }
		 System.out.println("END");
	 }
}
