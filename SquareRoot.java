package Assignment;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:" );
		int n=sc.nextInt();
		int start=0;
		int end=n;
		int ans=0;
		while(start<=end) {
			int mid=(start+end)/2;
			if(mid*mid==n) {
				ans=mid;
				break;
			}
			else if(mid*mid<n) {
				ans=mid;
				start=mid+1;
			}
			else
				end=mid-1;
		
		}
		System.out.println("Square Root= "+ ans);
sc.close();
	}

}
