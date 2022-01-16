package week41;

public class LinkedListkthIndex {
	Node head;
static class Node{
	int key;
	Node next;
	Node(int key){
		this.key=key;
		next=null;
	}
}
static LinkedListkthIndex insert(LinkedListkthIndex l1,int data) {
	Node new_node=new Node(data);
	if(l1.head==null) l1.head=new_node;
	  else{
          Node curr=l1.head;
          while(curr.next!=null){
              curr=curr.next;
          }
          curr.next=new_node;
      }
      return l1;
  }
static void printList(LinkedListkthIndex l1,int index){
	 int currindex=0;
      Node curr=l1.head;
       while(curr!=null){
    	   if(currindex==index) {
           System.out.print(curr.key);}
           curr=curr.next;
           currindex++;
       }
}
	public static void main(String[] args) {
		LinkedListkthIndex l1=new LinkedListkthIndex();
		 l1=insert(l1, 3);
	        l1=insert(l1, 5);
	        l1=insert(l1, 7);
	        l1=insert(l1, 9);
	        l1=insert(l1, 11);
	        printList( l1,2);
	}

}
