package week4;

import week4.LinkedList2.Node;

public class DeleteIndexList {
	static Node head;
	static class Node{
	  	int data;
	  	Node next;
	  	Node(int d){
	  		data=d;
	  		next=null;
	  	}
	  }
	public static DeleteIndexList insert(DeleteIndexList l1, int data) {
		   Node new_node=new Node(data);
		   if(l1.head==null) {
			   l1.head=new_node;
		   }
		   else {
			   Node curr=l1.head;
			   while(curr.next!=null) {
				   curr=curr.next;
			   }
			   curr.next=new_node;
		   }
		   return l1;
	 }
	public static DeleteIndexList deleteByKey(DeleteIndexList list,int position) {
		  Node currNode=list.head;
		  Node prev=null;
		  int val=0;
		  //Case1:
		  if(currNode==null ) {
			 return null ;
					 }
		  if(position==0) {
			  head=currNode.next;
		  }
		  for(int i=0;currNode.next !=null && i<position-1;i++) {
			  currNode=currNode.next;
		  }
		  if(currNode==null || currNode.next==null)
			  return null;
		  
		   prev=currNode.next.next;
		   currNode.next=prev;
		  

		  return list;
	}

	static void printList(DeleteIndexList l1) {
		  Node currNode=l1.head;
//		  System.out.println("LinkedList: ");
		  while(currNode!=null) {
			  System.out.print(currNode.data+" ");
			  currNode=currNode.next;
		  }
	}
	public static void main(String[] args) {
		DeleteIndexList list=new DeleteIndexList();
	     insert(list,4);
	     insert(list,5);
	     insert(list,7);
	     insert(list,9);
	     insert(list,11);
	     insert(list,13);
	     insert(list,14);
	     insert(list,15);
	     insert(list,17);
	System.out.println("Delete element with index: ");     
	     deleteByKey(list,8);
	     printList(list);

	}
}
