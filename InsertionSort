package sorting;
import java.util.*;
public class InsertionSort {
	static void insertionSort(int[] arr,int n) {
		int j;
		for(int i=0;i<n;i++) {
			j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
	}
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	int n=in.nextInt();
    	int[] arr=new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i]=in.nextInt();
    	}
    	insertionSort(arr,n);
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}
