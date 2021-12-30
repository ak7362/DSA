package Assignment;

public class CountRotation {
public static void main(String args[]) {
	int arr[]= {15,18,2,3,6,12};
	int count=-1;
	int min=arr[0];
	for(int i=1;i<arr.length-1;i++) {
		if(min>arr[i]) {
			min=arr[i];
			count=i;
		}
	}
	
	
	System.out.println(count);
}
}
