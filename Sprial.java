package Assignment;

public class Sprial {

	public static void main(String[] args) {
		int arr[][]={ {12,14,16},{18,20,22},{24,26,28}};
		System.out.println("sprial matrix :");
		int a=0;
		int x=arr.length-1;
		int b=0;
		int y=arr[0].length-1;
		while(a<=x && b<=y) 
		{
		for(int i=a;i<=y;i++) 
		{
			System.out.print(arr[a][i]+" ");
		}
		for(int i=a+1;i<=x;i++) {
			System.out.print(arr[i][y]+" ");
		}
		if(a+1 <= x)
		{
			for(int i=y-1;i>=y;i--) {
				System.out.print(arr[x][i]+" ");
			}
		}
		if(b+1 <= y)
		{
			for(int i=x-1;i>a;i--) {
				System.out.print(arr[i][b]+" ");
			}
		}
		a++;
		x--;
		b++;
		y--;
		}
	}
}
