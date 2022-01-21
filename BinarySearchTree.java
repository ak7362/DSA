package week41;

public class BinarySearchTree {
	Node root;
   class Node{
	   int key;
	   Node left,right;
	   Node(int key){
		   this.key=key;
		   left=right=null;
	   }
   }
   BinarySearchTree(){
	   root=null;
   }
   void insert(int val) {
	  root=insert(root,val); 
   }
   Node insert(Node root,int val) {
	   
	   if(root==null) {
		   root=new Node(val); 
	   }
	   if(val<=root.key) {
		 root.left=insert(root.left,val);
	   }
	   if(val>root.key)
		   root.right=insert(root.right,val);
	   return root;
   }
   void inOrder() {
	   InOrder(root);
   }
   void InOrder(Node root) {
	   if(root==null) return;
	   InOrder(root.left);
	   System.out.print(root.key+" ");
	   InOrder(root.right);
   }
   public static void main(String args[]) {
	   BinarySearchTree tree=new BinarySearchTree();
	   tree.insert(50);
	   tree.insert(30);
	     tree.insert(20);
	     tree.insert(40);
	     tree.insert(70);
	     tree.insert(60);
	     tree.insert(80);
//	     tree.inOrder();
	   }
}
