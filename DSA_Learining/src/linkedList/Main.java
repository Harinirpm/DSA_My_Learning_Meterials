package linkedList;

public class Main {
   public static void main(String[] args) {
	   CustomLinekedList ll = new CustomLinekedList();
	   ll.insert(5);
	   ll.insert(6);
	   ll.insert(7);
	   ll.insert(8);
	   ll.insert(10);
	   
	   ll.display();
	   ll.remove(8);
	   ll.display();
   }
}
