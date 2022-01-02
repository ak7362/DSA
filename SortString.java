package Assignment;

public class SortString {
public static void sortString(String str) {
	char arr[]=str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
			}
	System.out.println(arr);
}
	public static void main(String[] args) {
		 String str="abcdefabcdef";
         sortString(str);
	}

}
