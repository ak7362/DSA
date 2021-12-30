package Assignment;

public class SmallestNumber {
    public static void main(String args[]){
    	int arr[]= {2,3,4,5,6,7,8,1};
  System.out.println(findMin(arr));
    }
        
        
 public static  int findMin(int arr[]) {
        	int start=0;
            int end=arr.length-1;
            if(arr[start]<arr[end]){
            	return arr[0];
            }
       while(start<=end){
           int mid=start+(end-start)/2;
           if((mid<end) && arr[mid]>arr[mid+1]){
              return  arr[mid+1];
           }
           else if((mid>start)&& (arr[mid]<arr[mid-1])){
        	   return arr[mid];
           }
           else if(arr[start]<arr[mid]) {
        	   start=mid+1;
           }
           else
        	   end=mid-1;
       }
       return 0;

    }
}
