package week41;

public class HeightOfTree {
	static class Node{
		  int key;
		  Node left,right;
		  Node(int key){
			  this.key=key;
			  left=right=null;
		  }
	  }
static int getHeight(Node node) {
		if(node==null) {
			return -1;
		}
		else {
			int lheigth=getHeight(node.left);
			int rheigth=getHeight(node.right);
			if(lheigth>=rheigth) {
				return (lheigth+1);
			}
			else
				return (rheigth+1);
		}
	}

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		System.out.println(getHeight(root));

	}

}
