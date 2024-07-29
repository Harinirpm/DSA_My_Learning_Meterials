package sorting;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
	static void BubbleSort(int[] arr,int first,int second) {
		if(first==0) {
			return;
		}
		if(second<first) {
			if(arr[second]>arr[second+1]) {
				int temp=arr[second];
				arr[second]=arr[second+1];
				arr[second+1]=temp;
				BubbleSort(arr,first,second+1);
			}
			else {
				BubbleSort(arr,first,second+1);
			}
		}
		else {
			BubbleSort(arr,first-1,0);
		}
	}
  public static void main(String[] args) {
	  int[] arr= {4,3,2,1};
	  BubbleSort(arr,arr.length-1,0);
	  System.out.println(Arrays.toString(arr));
  }
}
