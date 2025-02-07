package dp;

import java.util.Scanner;

public class Factorial {
//	private static int factorial(int n) {
//		if(n==0) return 1;
//		return n * factorial(n-1);
//	}
	public static int dpFact(int n) {
		int[] dp = new int[n+1];
		dp[0] = 1;  //base case
		for(int i=1;i<=n;i++) {
			/*
			 * i = 1, 1<=5
			 * dp[1] = 1 * dp[1-1] = 1*1 = 1
			 * i=2, 2<=5
			 * dp[2]=2*dp[2-1]=2*1=2
			 * i=3, 3<=5
			 * dp[3]=3*dp[3-1]=3*2=6
			 * i=4, 4<=5
			 * dp[4] = 4*dp[4-1]=4*6=24
			 * i=5,5<=5
			 * dp[5]=5*dp[5-4]=5*24=120
			 */
			dp[i] = i * dp[i-1]; //1,1,2,6,24,120 
		}
		return dp[n]; //120
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		
//		int fact = factorial(n);
//		System.out.println(fact);
		System.out.println(dpFact(n));
		
		
		

	}

}
