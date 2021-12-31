package Assignment;

public class FirstLastOccurance {
	static int first=-1;
	static int last=-1;
static void findFirstLastOccurance(String str,int idx,char x) {
	if(idx==str.length()) {
		System.out.println("first index:" +first);
		System.out.println("last index: "+last);
		return;
	}
	if(str.charAt(idx)==x) {
		if(first==-1) {
			first=idx;
		}
		else
			last=idx;
	}
	findFirstLastOccurance(str,idx+1,x);
	
}
	public static void main(String[] args) {
		String str="abcdefabcdef";
		findFirstLastOccurance(str,0,'a');

	}

}
