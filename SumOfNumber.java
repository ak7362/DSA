package Assignment;

public class SumOfNumber {
static int count=0;
public static int digitnumbers(int x) {
	if(x==0) {
		return 0;
	}
    count+=x%10+ digitnumbers(x/10);
	return count;
}
	public static void main(String[] args) {
	int x=468105;
	System.out.println(digitnumbers(x));

	}

}
