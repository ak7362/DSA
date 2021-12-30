package Assignment;
import java.util.Scanner;
public class Print1Ton {
static void print(int i,int n) {
	if(i>n) {
		return;
	}
	System.out.print(i+" ");
	print(i+1,n);
	
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=sc.nextInt();
	print(1,n);
	}

}
