package queue;

public class CircularQueue {
   protected int[] data;
   private static final int DEFAULT_SIZE=10;
   protected int front=0;
   protected int end=0;
   private int size=0;
   public CircularQueue(){
	   this(DEFAULT_SIZE);
   }
   
   public CircularQueue(int size) {
	   this.data=new int[size];
   }
   
   public boolean isFull() {
	   return size==data.length;
   }
   
   public boolean isEmpty() {
	   return size==0;
   }
   public boolean add(int item) {
	   if(isFull()) {
		  return false;
	   }
	   data[end++]=item;
	   end=end%data.length;
	   size++;
	   return true;
   }
   
   public int remove() throws QueueException{
	   if(isEmpty()) {
		   throw new QueueException("Stack is empty!...");
	   }
	   int removed=data[front++];
	   front=front%data.length;
	   size--;
	   return removed;
   }
   
   public int peek()throws QueueException{
	   if(isEmpty()) {
		   throw new QueueException("Queue is Empty!....");
	   }
	   return data[front];
   }
   
   public void display() {
	   if(isEmpty()) {
		   System.out.println("Queue is Empty!...");
		   return;
	   }
	   int i=front;
	   do {
		   System.out.print(data[i]+"->");
		   i++;
		   i%=data.length;
	   }while(i!=end);
	   System.out.print("END");
   }
   
}
