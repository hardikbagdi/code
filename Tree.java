class Node{
	public int data;
	public Node left=null;
	public Node right=null;
	public Node(int d){
		data=d;
		left=null;
		right=null;
	}
}

 class Tree{


public static void inOrder(Node root){

if(root==null) return;
else
{
	inOrder(root.left);
	System.out.println(root.data);
	inOrder(root.right);
}
}
public static void preOrder(Node root){

if(root==null) return;
else
{
	System.out.println(root.data);
	inOrder(root.left);
	inOrder(root.right);
}
}
public static void postOrder(Node root){

if(root==null) return;
else
{
	inOrder(root.left);
	inOrder(root.right);
	System.out.println(root.data);
}
}
 public static void main(String[] args) {
 	Node root = new Node(0);
 	root.left= new Node(1);
 	root.right= new Node(2);
 	inOrder(root);
  	System.out.println();
 	preOrder(root);
  	System.out.println();
 	postOrder(root);
  	System.out.println();
 }

}