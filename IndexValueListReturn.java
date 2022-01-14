package week41;

import week41.IndexValueList.Node;

public class IndexValueListReturn {
	Node head;
	  static  class Node{
	    	int data;
	    	Node next;
	    	Node(int data){
	    		this.data=data;
	    		next=null;
	    	}
	    }


	  static IndexValueListReturn insert(IndexValueListReturn l1,int data){
	      Node new_node=new Node(data);
	      if(l1.head==null){
	          l1.head=new_node;
	      }
	      else{
	          Node curr=l1.head;
	          while(curr.next!=null){
	              curr=curr.next;
	          }
	          curr.next=new_node;
	      }
	      return l1;
	  }
	  public static int index(IndexValueListReturn l1, int key) {
		  Node curr=l1.head;
		  int count=0;
		  while(curr!=null) {
			  if(curr.data==key) {
				 return count;
			  }
//			  System.out.println(curr.data);
			  else {
				  count++;
				  curr=curr.next;
			  }
		  }
		  return -1; 
	  }
	public static void main(String[] args) {
		IndexValueListReturn l1=new IndexValueListReturn();
		insert(l1,1);
		insert(l1,2);
		insert(l1,3);
		insert(l1,4);
		insert(l1,5);
		insert(l1,6);
		insert(l1,7);
		insert(l1,8);
	System.out.println("Index value:"+ index(l1,6));

	}

}
