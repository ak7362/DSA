package Assignment;
import java.util.Scanner;
public class Fibnoncii {
  static int fib(int x) {
	  if(x==1) {
		  return 1;
	  }
	  if(x==0) {
		  return 0;
	  }
	  return fib(x-1)+fib(x-2);
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		System.out.println("Fibonacci no: "+fib(n));
sc.close();
	}

}
