package Assignment;

public class OrderLogn {
public static void main(String args[]) {
	int arr[]= {12,14,16,18,20,22,26,28,30,40};
	int target=25;
	boolean flag=true;
	int start=0;
	int end=arr.length;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			System.out.println(mid);
			flag=false;
		}
		if(target>arr[mid]) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}
	}
	if(flag) {
		System.out.println(arr[end]);
		System.out.println(arr[start]);
	}
}
}



