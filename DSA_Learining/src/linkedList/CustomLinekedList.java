package linkedList;

import java.util.NoSuchElementException;

public class CustomLinekedList {
  private Node head; // here i don't want to access the node 'head & tail' directly to some another class so that i put my nodes as private.
  private Node tail;
  private int size;
  
  public CustomLinekedList() {
	  this.size=0;
  }
  
  class Node{  // i don't want to access my node directly to another class so i put as private
	  private int value;
	  private int index;
	  private Node next;
   
	 public Node(int value){
		  this.value=value;
	  }
	 public Node (int value, Node next) {
		 this.value=value;
		 this.next=next;
	 }
	 public Node (int value, int index) {
		 this.value=value;
		 this.index=index;
	 }
	 
	 
  }
  //insert an element at first:
	 public void insertFirst(int value) {
		 Node node = new Node(value);
		 node.next=head;
		 head = node;
		 if(tail==null) {
			 tail=head;
		 }
		 size++;
	 }
		 //insert an elements at last:
		 public void insertLast(int value) {
			 if(tail==null) {
				 insertFirst(value);
				 return;
			 }
			 Node node =new Node(value);
			 tail.next=node;
			 tail=node;
			 size++;
			 
		 }
		// adding elements:
		 public void add(int value) {
		 Node node = new Node(value);
		 if(head==null) {
		 node.next=head;
		 head = node;
		 tail=node;
		 }
		 else {
		 tail.next=node;
		 tail=node;
		 }
	     size++;
		 }
		 
		 //insert an element in specific index:
		 public void insert(int value, int index) {
			 if(index < 0 || index > size) {
				 throw new IndexOutOfBoundsException("Invalid Index");
			 }
			 if(index==0) {
				 insertFirst(value); 
				 return;
			 }
			 if(index==size) {
				 insertLast(value);
				 return;
			 }     
			 
			 Node temp=head;
			 for(int i = 1; i < index; i++) {
				 temp = temp.next;
				 if(temp==null) {
					 throw new IndexOutOfBoundsException("Invalid index: List is shorter the requires index.");
				 }
			 }
			 
			 Node node = new Node(value); // the node pointing to the current node's next 
			 node.next=temp.next;
			 temp.next = node; // now, the temp pointing to the new node. and the connection btw 'temp' & 'temp.next' will be disconnected.
			 
			 size++;
		 }
	  
		 //Delete the node at first:
		 public int deleteFirst() {
			 int val = head.value;
			 head=head.next;
			 if(head==null) {
				 tail=null;
			 }
			 return val;
		 }
		 //Delete the node at Last:
		 public int deleteLast() {
			 if(size==0) {
				 throw new NoSuchElementException("List is empty");
			 }
			 if(size==1) {
				return deleteFirst();
			 }
			 Node LastSecondIndex=get(size-2);
			 int val=tail.value;
			 tail=LastSecondIndex;
			 tail.next=null;
			 size--;
			 return val;
		 }
		 
		 //get the secondLast node for delete the last node:
	public Node get(int index) {
			 if (index < 0 || index >= size) { // Validate index
			        throw new IndexOutOfBoundsException("Invalid index");
			    }
			 Node node=head;
			 for(int i=1;i<index;i++) {
				 node=node.next;
			 }
			 return node;
		 }
		 
	// removing the specific element:
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
