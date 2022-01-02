package Assignment;

public class MaxMin {
	static int min=2147483647;
	static int max=-2147483648;
static void maxminfun(int arr[],int idx) {
	if(idx==arr.length) {
		return ;
	}
	if(arr[idx]<=min) {
		min=arr[idx];
	}
	else if(arr[idx]>=max) {
		max=arr[idx];
	}
	maxminfun(arr,idx+1);
}
	public static void main(String[] args) {
	  int arr[]= {1,-1,0,2,-2,3,-3,4,-4};
	  maxminfun(arr,0);
System.out.println("Minimum value: "+min);
System.out.println("Maximum value: "+max);
	}

}
