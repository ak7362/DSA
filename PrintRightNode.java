package week41;
import java.util.*;
public class PrintRightNode {
static class Node{
		int key;
		Node left,right;
		Node(int item){
			key=item;
			left=right=null;
		}
	}

static void PrintRightNode1(Node root) {
	Queue <Node> q=new LinkedList<>();
	q.add(root);
	while(!q.isEmpty()) {
		int k=q.size();
		for(int i=0;i<=k;i++) {
			Node front=q.poll();
			 System.out.println(front.key);	
				 q.add(front.right); 	
				 
		}
	}
}
static void PrintRightNode(Node root) {
if(root==null) return ;
System.out.println(root.key);
PrintRightNode(root.right);
}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
//		root.right.right.left=new Node(7);
PrintRightNode1(root);
	}

}
