package stack;

public class StackMain {
   public static void main(String[] args) throws StackException {
	   CustomStack stack =new CustomStack(5);
	   stack.push(3);
	   stack.push(4);
	   stack.push(5);
	   stack.push(6);
	   stack.push(7);
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   System.out.println(stack.pop());
	   
	   
   }
}
