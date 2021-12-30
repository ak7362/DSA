package Assignment;

public class DigionlMatrix2 {

	public static void main(String[] args) {
		 int arr[][]= {{2,7,6,4},{14,12,9,1},{19,56,41,32},{22,24,26,29}};
		  for(int i=0;i<arr.length;i++) {
			  for(int j=0;j<arr[i].length;j++) {
				  if((i+j)==arr[i].length-1) 
					  System.out.print(arr[i][j]+" "); 
				  }
			  
		  }
	}

}
