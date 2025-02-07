package tree.binarySearchTree;

public class BST {
	public BST() {
		
	}
	private class Node{
		private int data;
		private Node left;
		private Node right;
		private int height;
		
		Node(int data){
			this.data = data;
		}
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	
	
	//insert elements
	public void insert(int data) {
		root = insert(data, root);
	}
	public Node insert(int data, Node node) {
	if(node == null) {
		node = new Node(data);
		return node;
	}
	if(data<node.data) {
		node.left = insert(data,node.left);
	}
	if(data>node.data) {
		node.right = insert(data, node.right);
	}
	node.height = Math.max(height(node.left), height(node.right))+1;
	return node;
	}
	
	//insert array of elements.
		public void populate(int[] nums) {
			for(int i = 0; i<nums.length;i++) {
				this.insert(nums[i]);
			}
		}
		//self balancing binary tree. it automatically balanced itself. 
		public void populatedSorted(int[] nums) {
			populatedSorted(nums,0,nums.length);
		}
		public void populatedSorted(int[] nums,int start,int end) {
			if(start>=end) return;
			int mid = start+(end-start)/2;
			this.insert(nums[mid]);
			populatedSorted(nums, start,mid); //left half
			populatedSorted(nums,mid+1,end); //right half
		}
	
	//find height :
	public int height (Node node) {
		if(node == null) return -1;
		return node.height;
	}
	
	//find isEmpty.
	public boolean isEmpty() {
		return root == null;
	}
	
	// find tree is balanced or not.
	public boolean isBalanced() {
		return isBalanced(root);
	}
	private boolean isBalanced(Node node) {
		if(node == null) return true;
		return Math.abs(height(node.left)-height(node.right)) <=1  && isBalanced(node.left)&& isBalanced(node.right); 
	}
	
	// display the tree node.
	public void display() {
		display(this.root ,"Root Node : ");
		System.out.println("-------------------------------------");
	}
	private void display(Node node , String details) {
		if(node == null) return;
		System.out.println(details + node.data);
		display(node.left, "LeftNode of "+ node.data+" : ");
		display(node.right, "RightNode of "+ node.data+" : ");
	}
}
