package Assignment;
import java.util.Scanner;
public class OrderNSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			System.out.print(j+" ");
		}
		System.out.println("\n");
	

	}

}
