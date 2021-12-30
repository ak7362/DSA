package Assignment;

public class SingalForLoopMatrix {
public static void main(String args[]) {
	 int arr[][]= {{2,7,6,4},{14,12,9,1},{19,56,41,32},{22,24,26,29}};
	 int j=arr.length-1;
	 for(int i=0;i<arr.length;i++) {
		 int row=i;
		 System.out.println(arr[i][j--]);
	 }
}
}
