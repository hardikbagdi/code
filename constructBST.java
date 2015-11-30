import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node parent;
}

class constructBST{

	public static void setParent(Node root, Node parent){
		root.parent=parent;
		parent = root;
		if(root.left!=null)
			setParent(root.left,root);
		if(root.right!=null)
			setParent(root.right,parent);
	}

	public static Node nextInorder(Node n){
		Node parent;
		if(n == null) 
			return null;
		if(n.right!=null)
			return leftmost(n.right);
		else
		{
			parent = n.parent;
			while(parent!=null && parent.right== n){
				n=parent;
				parent = parent.parent;

			}
			return parent;
		}
			

	}
	public static Node leftmost(Node n){
		while(n.left!=null)
			n= n.left;
		return n;
	}

	public static boolean checkBSTHelper(Node root, int min , int max){
		if(root == null)
			return true;
		if(root.data<= max & root.data >= min)
			return checkBSTHelper(root.left,min,root.data) && checkBSTHelper(root.right, root.data , max);
		else 
			return false;
	}
	public static boolean checkBST(Node root){
		return checkBSTHelper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static void addelement(Node root, int height, ArrayList<LinkedList<Node>> lists){
		LinkedList<Node> list=null;
		try{

			list = lists.get(height);
		}
		catch(Exception e){
			
			list = new LinkedList<Node>();
			lists.add(list);
		}
		finally{
			list.add(root);
		}
		lists.set(height,list);
		if(root.left!=null)
			addelement(root.left,height+1,lists);
		if(root.right!=null)
			addelement(root.right,height+1,lists);
	}
	public static ArrayList<LinkedList<Node>> createLinkedLists(Node root){
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		addelement(root,0,lists);
		return lists;

	}
	public static void inorder(Node root){
		if(root==null) 
			return;
		//(root.data);
		System.out.println("left child");
		inorder(root.left);
		System.out.println(root.data);
		System.out.println("right child");
		inorder(root.right);
	}
	public static Node construct (int[] a, int start, int end){
		if(end<start )
			return null;
		int mid = (start+end)/2;
		Node n = new Node();
		n.data = a[mid];
		n.left = construct(a, start, mid-1);
		n.right= construct(a,mid+1, end);
		return n;
	}
	public static void main(String[] args) {
		int[] a = new int[10];
		for( int i=0;i<10;i++){
			a[i]=i;
		}
		Node root;
		root = construct (a, 0, a.length-1);		
		inorder(root);
		ArrayList<LinkedList<Node>> as = createLinkedLists(root);
		System.out.println(as);
		for(LinkedList<Node> l : as){
			for(Node n : l){
				System.out.print(n.data+"\t");
			}
			System.out.println();

		}

		System.out.println("Is bst :   "+checkBST(root));

		setParent(root,null);
		Node n2 =  nextInorder(root);
		System.out.println("nextinorder: "+ nextInorder(root).data);
		 n2 =  nextInorder(n2);
		System.out.println("nextinorder: "+ n2.data);
		 n2 =  nextInorder(n2);
		System.out.println("nextinorder: "+ n2.data);
		
		System.out.println("nextinorder: "+ nextInorder(n2).data);
		
	}
}