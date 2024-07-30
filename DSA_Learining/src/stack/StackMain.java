package stack;

import java.util.Arrays;

public class StackMain {
   public static void main(String[] args) throws StackException {
	   CustomStack stack =new DynamicStack(5);
	   stack.push(3);
	   stack.push(4);
	   stack.push(5);
	   stack.push(6);
	   stack.push(7);
//	   System.out.println(stack.pop());
//	   System.out.println(stack.pop());
//	   System.out.println(stack.pop());
//	   System.out.println(stack.pop());
//	   System.out.println(stack.pop());
	   
	   System.out.println(stack.size());
	   
	   
	   int[] stackArray=stack.toArray();
	     System.out.print("[");
	   for(int i=0;i<stackArray.length;i++) {
		   System.out.print(stackArray[i]);
		   if(i<stackArray.length-1) {
			   System.out.print(",");
		   }
	   }
	   System.out.print("]");
	   
   }
}
