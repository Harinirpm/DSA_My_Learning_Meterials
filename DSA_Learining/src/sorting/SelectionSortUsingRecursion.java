package sorting;

import java.util.Arrays;

public class SelectionSortUsingRecursion {
   public static void SelectionSort(int[] arr,int n,int second,int max) {
	   if(n==0) {
		   return;
	   }
	   if(second<n) {
		   if(arr[second]>arr[max]) {
			   SelectionSort(arr,n,second+1,second);
		   }
		   else
			   SelectionSort(arr,n,second+1,max);
	   }
	   else {
		   int temp=arr[max];
		   arr[max]=arr[n-1];
		   arr[n-1]=temp;
		   SelectionSort(arr,n-1,0,0);
	   }
   }
   public static void main(String[] args) {
	   int[] arr= {4,3,2,1};
	   int n=arr.length;
	   SelectionSort(arr,n,0,0);
	   for(int i=0;i<n;i++)
	   System.out.print(arr[i]+" ");
   }
}
