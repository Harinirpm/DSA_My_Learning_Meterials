package sorting;
import java.util.Scanner;
public class SelectionSort {
	
	static void swap(int[] arr,int focusElement,int swapElement) {
		int temp=arr[focusElement];
		arr[focusElement]=arr[swapElement];
		arr[swapElement]=temp;
	}
	
	static void selectionSort(int[]arr,int n,int start) {
		if(start>=n) {
			return;
		}
		int minIndex=start;
		for(int i=start+1;i<n;i++){
			if(arr[minIndex]>arr[i]) {
				minIndex=i;
			}
		}
		
		swap(arr,start,minIndex);
		selectionSort(arr,n,start+1);
	}
   public static void main(String[] args) {
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int[] arr=new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=in.nextInt();
	   }
	   selectionSort(arr,n,0);
	   for(int i=0;i<n;i++)
	   System.out.print(arr[i]+" ");
   }
}
