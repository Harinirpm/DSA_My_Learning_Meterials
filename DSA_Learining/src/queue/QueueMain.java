package queue;

public class QueueMain {
  public static void main(String[] args) throws QueueException {
//	  CustomQueue queue=new CustomQueue(5);
	  CircularQueue queue=new CircularQueue(5);
	  queue.add(2);
	  queue.add(3);
	  queue.add(4);
	  queue.add(5);
	  queue.add(6);
	  
//	  queue.display();
//	  System.out.println();
	  System.out.println(queue.remove());
	  queue.display();
	  System.out.println();
	  queue.add(6);
	  queue.display();
	  
	  
	  
  }
}
