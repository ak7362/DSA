package week41;

import week41.CountNode.Node;

public class LeafNode {
	static class Node{
		  int key;
		  Node left,right;
		  Node(int key){
			  this.key=key;
			  left=right=null;
		  }
	  }
	public static void printLeafNode(Node root) {
		if(root==null) return;
		if(root.left ==null && root.right==null) {
			System.out.println("Leaf node:"+ root.key);
		}
		printLeafNode(root.left);
		printLeafNode(root.right);
		
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
     printLeafNode(root);
	}

}
