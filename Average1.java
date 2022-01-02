package Assignment;

public class Average1 {
static int sum=0;
static void average(int arr[],int idx) {
	if(idx==arr.length){
		return ;
	}
	 sum=sum+arr[idx];
	 average(arr,idx+1);
}
	public static void main(String[] args) {
		int arr[]= {12,14,16,18,20,22};
		average(arr,0);
		 System.out.println("Average: "+sum/(arr.length-1));
	}

}
