package Assignment;

public class TargetSearch {

	public static void main(String[] args) {
	int nums[]= {-1,0,3,5,9,12};
	int target=9;
	int start=0;
	int end=nums.length-1;
	boolean b1= true;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(nums[mid]==target) {
			 b1=false;
			System.out.println("Index: "+mid);
		}
		 if(nums[mid]>target) {
			end=mid-1;
		}
		else
			start=mid+1;;
	}
	if(b1) {
		System.out.println("Element is not present");
	}

	}

}
