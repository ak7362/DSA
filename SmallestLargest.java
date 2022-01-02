package Assignment;

public class SmallestLargest {
	static  int s=2147483647;
	static int l=-2147483648;
	public static void main(String[] args) {
		int arr[]= {3,4,5,6,1,2};
	 for(int i=0;i<arr.length;i++) {
		 if(s>arr[i]) {
			 s=arr[i];
		 }
		 else if(l<arr[i])
			 l=arr[i];
	 }
System.out.println("Smallest:"+ s);
System.out.println("Larget:" +l);
	}

}
