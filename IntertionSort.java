package Assignment;

import java.util.Arrays;

public class IntertionSort {
public static void intersection(int arr[]) {
	int n=arr.length;
	for(int i=1;i<n;i++) {
		int j=i-1;
		int key=arr[i];
		for(j=j-1;j>=0;j++) {
			if(arr[j]>key) {
				arr[j+1]=arr[j];
			}
		
		}
		arr[j+1]=key;
	}
	
}
	public static void main(String[] args) {
		int arr[]= {12,5,3,-1};
		intersection(arr);
		System.out.println("==========================");
		System.out.println(Arrays.toString(arr));

	}

}
