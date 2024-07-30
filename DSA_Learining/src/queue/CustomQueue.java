package queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=0;
    
    public CustomQueue() {
    	this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
    	this.data=new int[size];
    }
    public boolean add(int item) {
    	if(isFull()) {
    		System.out.println("Queue is full!...");
    		return false;
    	}
    	data[ptr++]=item;
    	return true;
    }
    public int remove() throws QueueException{
    	if(isEmpty()) {
    	throw new QueueException("Queue is Empty.......");
    	}
    	int removed=data[0];
    	
    	for(int i=1;i<ptr;i++) {
    		data[i-1]=data[i];
    	}
        ptr--;
    	return removed;
    }
    public int peek()throws QueueException{
    	if(isEmpty()) {
    		throw new QueueException("Queue is empty now!...");
    	}
    	return data[0];
    }
    public void display() {
    	for(int i=0;i<ptr;i++) {
    		System.out.print(data[i]+"->");
    	}
    	System.out.print("END");
    }
    public boolean isFull() {
    	return ptr==data.length;
    }
    public boolean isEmpty() {
    	return ptr==0;
    }
    
    
}
