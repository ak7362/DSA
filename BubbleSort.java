package Assignment;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {12,5,3,-1};
	bubbleSort(arr);
	System.out.println("=====================================");
	System.out.println(Arrays.toString(arr));

	}

}
