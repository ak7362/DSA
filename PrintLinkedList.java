package week41;

import week41.LinkedLists.Node;

public class PrintLinkedList {
	Node head;
	  static  class Node{
	    	int data;
	    	Node next;
	    	Node(int data){
	    		this.data=data;
	    		next=null;
	    	}
	    }


	  static PrintLinkedList insert(PrintLinkedList l1,int data){
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
	  public static void print(PrintLinkedList l1, int index) {
		  Node curr=l1.head;
		  int count=0;
		  while(curr!=null) {
			  if(count>=index) {
				  System.out.print(curr.data+" ");
			  }
//			  System.out.println(curr.data);
			  count++;
			  curr=curr.next;
		  }
	  }

 
	public static void main(String[] args) {
		 PrintLinkedList l1=new PrintLinkedList();
	        l1=insert(l1, 1);
	        l1=insert(l1, 2);
	        l1=insert(l1, 3);
	        l1=insert(l1, 4);
	        l1=insert(l1, 5);
	        l1=insert(l1, 6);
	        l1=insert(l1, 7);
  print(l1,3);
	}

}
