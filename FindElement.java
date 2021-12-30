package Assignment;

public class FindElement {
	static int arr[]= {1,2,3,6,4,3,-1,9,7,9};
 static void findelement(int index,int target) {
	 if(arr[index]==target) {
		 System.out.println(index);
		 return;
	 }
	 findelement(++index,target);
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findelement(0,-1);
	}

}
