package Assignment;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n X m matrix:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int [n][m];
		System.out.println("Enter matrix Element:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			
			}
		
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
