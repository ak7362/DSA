package week41;
class BinarySearchTree1 {

 
 class Node 
 {
     int key;
     Node left, right;

     public Node(int item)
     {
         key = item;
         left = right = null;
     }
 }

 
 Node root;

 BinarySearchTree1() 
 { 
      root = null; 
 }

 
 void insert(int key) 
 { 
      root = insertRec(root, key); 
 }

 
 Node insertRec(Node root, int key)
 {
     if (root == null) 
     {
         root = new Node(key);
         return root;
     }

     /* Otherwise, recur down the tree */
     if (key <= root.key)
         root.left = insertRec(root.left, key);
     else if (key > root.key)
         root.right = insertRec(root.right, key);

     /* return the (unchanged) node pointer */
     return root;
 }

 // This method mainly calls InorderRec()
 void inorder() 
 { 
      inorderRec(root); 
 }

 // A utility function to 
 // do inorder traversal of BST
 void inorderRec(Node root)
 {
     if (root != null) {
         inorderRec(root.left);
         System.out.println(root.key);
         inorderRec(root.right);
     }
 }

 // Driver Code
 public static void main(String[] args)
 {
     BinarySearchTree1 tree = new BinarySearchTree1();

     /* Let us create following BST
           50
        /     \
       30      70
      /  \    /  \
    20   40  60   80 */
     tree.insert(50);
     tree.insert(30);
     tree.insert(20);
     tree.insert(40);
     tree.insert(70);
     tree.insert(60);
     tree.insert(80);

     // print inorder traversal of the BST
     tree.inorder();
 }
}

