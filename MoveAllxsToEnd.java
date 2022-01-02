package Assignment;

public class MoveAllxsToEnd {
static void movex(String s,int idx,int count,String newString) {
	if(idx==s.length()) {
		while(count>0) {
			newString+='x';
			--count;
		}
		System.out.println(newString);
		return;
	}
	if(s.charAt(idx)=='x') {
		++count;
		movex(s,idx+1,count,newString);
	}
}
	public static void main(String[] args) {
//	movex("axbtyxxcda",0,0);

	}

}
