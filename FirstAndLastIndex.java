package Assignment;

public class FirstAndLastIndex {
public static void main(String args[]) {
	int arr[]= {1,2,3,4,4,5,5,6,6,6,7,7,7,9,9,9,9,9};
	int target=9;
	int first=firstIndex(arr,target);
	int last=lastIndex(arr,target);
	int a[]= {first,last};
	System.out.println("["+a[0]+" "+a[1]+"]" );
}
 static int firstIndex(int arr[],int target) {
	 int firstindex=-1;
	 int start=0;
	 int end=arr.length-1;
	 while(start<=end) {
		 int mid=start+(end-start)/2;
		 if(arr[mid]==target) {
			 firstindex=mid;
			 end=mid-1;
		 }
		 else if(target>arr[mid]) {
			 start=mid+1;
		 }
		 else
			 end=mid-1;
		 
	 }
	return firstindex;
}
 static int lastIndex(int arr[],int target) {
	int  lastindex=-1;
	int start=0;
	int end=arr.length-1;
	 while(start<=end) {
		 int mid=start+(end-start)/2;
		 if(arr[mid]==target) {
			 lastindex=mid;
			 start=mid+1;
		 }
		 else if(target>arr[mid]) {
			 start=mid+1;
		 }
		 else
			end= mid-1;
	 }
	 return lastindex;
	 }
// 
}
