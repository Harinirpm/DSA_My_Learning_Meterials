package stack;

public class DynamicStack extends CustomStack
{
	protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    
    public DynamicStack() {
    	super();
    }
    public DynamicStack(int size) {
    	super(size);
    }
    @Override
    public boolean push(int item) {
    	if(this.isFull()) {
    		int[] temp=new int[data.length*2];
    		for(int i=0;i<data.length;i++) {
    			temp[i]=data[i];
    		}
    		data=temp;
    	}
    	
    	return super.push(item);	
    }
}
