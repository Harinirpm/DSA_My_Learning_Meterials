package practice;
import java.util.*;
public class GenerateBinaryStringWithoutContiguous1s {
   public static ArrayList<String> generateBinaryString(int n){
	   if(n==0) {
		   ArrayList<String> emptyList = new ArrayList<>();
		   emptyList.add(" ");
		   return emptyList;
	   }
	   if(n == 1) {
		   ArrayList<String> list = new ArrayList<>();
		   list.add("0");
		   list.add("1");
		   return list;
	   }
	   ArrayList<String> result = new ArrayList<>();
	   ArrayList<String> prevList = generateBinaryString(n-1);
	   for(String s : prevList) {
		   result.add(s + '0');
		   if(s.charAt(s.length()-1) != '1') {
			   result.add(s+'1');
		   }
	   }
	   return result;
   }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<String> binaryString = generateBinaryString(n);
		for(String s : binaryString) {
			System.out.println(s);
		}
	}
	
//	static void printString(int[] a, int n) {
//		for(int i = 0;i < n; i++) {
//			System.out.print(a[i]);
//			}
//		System.out.println();
//		return;
//	}
//	static void generate(int[] a, int k, int n) {
//		if(n == k) {
//			printString(a,n);
//			return;
//		}
//		if(a[n-1] == 0) {
//			a[n] = 0;
//			generate(a, k, n+1);
//			a[n] = 1;
//			generate(a, k, n+1);
//		}
//		if(a[n-1] == 1) {
//			a[n] = 0;
//			generate(a, k, n+1);
//		}
//	}
//	static void generateBinaryString(int[] a, int k) {
//		a[0] = 0;
//		generate(a, k, 1);
//		
//		a[0] = 1;
//		generate(a, k, 1);
//	}
//	 
//  public static void main(String[] args) {
//	  Scanner in =  new Scanner(System.in);
//	  int k = in.nextInt();
//	  int[] a = new int[k];
//	  generateBinaryString(a, k);
//  }
}
