package Assignment;
import java.util.Scanner;
public class Factorial {
	static int fact=1;
 static void factorial(int n){
	if(n<=0) {
		return;
	}
	fact=fact*n;
	factorial(n-1);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		factorial(n);
		System.out.println(fact);
sc.close();
	}

}
