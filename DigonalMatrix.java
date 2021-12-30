package Assignment;

public class DigonalMatrix {

	public static void main(String[] args) {
	  int a[][]= {{2,7,6,4},{14,12,9,1},{19,56,41,32},{22,24,26,29}};
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<a[i].length;j++) {
			  if(i==j)
			  System.out.printf("a[%d][%d]=%d",i,j,a[i][j]);
			  }
		  System.out.println();
	  }

	}

}
