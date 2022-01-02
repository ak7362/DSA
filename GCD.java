package Assignment;
import java.util.Scanner;
public class GCD {
static int gcd(int a,int b) {
	if(a==0) {
		return b;
	}
	else if(b==0) {
		return a;
	}
	else if(a>b) {
		return gcd(a-b,b);
	}
	return gcd(a,b-a);
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two number:");
	int a=sc.nextInt();
	int b=sc.nextInt();
 System.out.println("GCD of " + a +" and " + b + " is " + gcd(a,b));
sc.close();
	}

}
