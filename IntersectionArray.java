package Assignment;

import java.util.ArrayList;

public class IntersectionArray {
    public static void intersection(int[] nums1, int[] nums2) {
        ArrayList <Integer > list=new ArrayList<>();
        for(int i=0;i<nums1.length-1;i++){
            for(int j=0;j<nums2.length-1;j++){
               if(nums1[i]==nums2[j]){
                   list.add(nums1[i]);
               } 
            }
        }
        
        System.out.print("[");
       for(int k=0;k<list.size();k++) {
    	   System.out.print(list.get(k)+" ");}
         System.out.print("]");
      } 
    public static void main(String args[]){
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        intersection(nums1,nums2);
    }
}

