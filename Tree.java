package week41;

public class Tree {
 static class Node{
	  int key;
	  Node left,right;
	  Node(int key){
		  this.key=key;
		  left=right=null;
	  }
  }
 public static void preorder(Node root) {
	     if(root==null) {
	    	 return;
	     }
	     System.out.print(root.key+" ");
	     preorder(root.left);
	     preorder(root.right);
 }
 public static void Inorder(Node root) {
	
	 if(root==null) {
		 return;
	 }
	
	 Inorder(root.left);
	 System.out.print(root.key+" ");
	 Inorder(root.right);
 }
 public static void postorder(Node root) {
	 if(root==null) {
		 return;
	 }
	 postorder(root.left);
	 postorder(root.right);
	 System.out.print(root.key+" ");
 }
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		System.out.print("1)Preoder Tree: ");
		preorder(root);
		System.out.println();
		System.out.print("2)Inoder Tree: ");
        Inorder(root); 
        System.out.println();
		System.out.print("3)Postoder Tree: ");
        postorder(root); 
	}

}
