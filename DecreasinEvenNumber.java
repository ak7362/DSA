package Assignment;
import java.util.Scanner;
public class DecreasinEvenNumber {
static void even(int i,int n) {
	if(n<=1) {
		return;
	}
     i=i+2;
	even(i,n-2);
	
	System.out.print(i+" ");
	
//	if(n%2!=0) {
//	n=n-1;
//	System.out.print(n+" ");
//	}
//	else
//		System.out.print(n+" ");
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		even(0,n);
		sc.close();

	}

}
