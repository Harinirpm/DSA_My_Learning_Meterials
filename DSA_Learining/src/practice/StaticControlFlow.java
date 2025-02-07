package practice;

//parent
 class Parent {
	 static int x = 10;
	 static {
		 m1();
		 System.out.println("Parent - FSB");
	 }
	 public static void m1() {
		 System.out.println(y + " y");
	 }
	 static {
		 System.out.println("PSSB");
	 }
	 static int y = 20;
 }
 
 // child
public class StaticControlFlow extends Parent{
	static int a = 100;
	static {
		m2();
			System.out.println("Child - FSB");
	}

	public static void main(String[] args) {
		m2();
		System.out.println("Child-Main");
	}
	public static void m2() {
		System.out.println(b + " b");
	}
	static {
		System.out.println("Child - SSB");
	}
	static int b = 200;

}
