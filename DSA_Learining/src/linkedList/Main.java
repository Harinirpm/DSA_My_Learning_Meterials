package linkedList;

public class Main {
   public static void main(String[] args) {
	   CustomLinekedList ll = new CustomLinekedList();
	   ll.insertFirst(5);
	   ll.insertLast(6);
	   ll.insertLast(7);
	   ll.insertLast(8);
	   ll.insertLast(10);
//	   ll.display(); //display
	   
	   ll.insert(80, 4);
//	   ll.display(); //display
	   
	   ll.remove(8);
//	   ll.display();  //display
	   
	   ll.insertFirst(11);
//	   ll.display();   //display
	   
	   ll.remove(11);
	   ll.insertLast(30);
//	   ll.display();   //display
	   
	   System.out.println(ll.deleteLast());
	   ll.display();
//	   System.out.println(ll.deleteFirst());
//	   ll.display();
   }
}
