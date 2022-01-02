package Assignment;
import java.util.Scanner;
public class Recursion {
public static int fun(int x,int y) {
	if(y==0) {
		return 0;
	}
	return (x+fun(x,y-1));
}
public static int fun1(int a,int b) {
	if(b==0) {
		return 1;
	}
	return fun(a,fun1(a,b-1));
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(fun1(x,y));
	}

}
