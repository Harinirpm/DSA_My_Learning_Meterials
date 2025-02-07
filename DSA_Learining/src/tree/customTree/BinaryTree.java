package tree.customTree;

import java.util.Scanner;

public class BinaryTree {
	BinaryTree(){	}
	//Node
	private class Node{	
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data= data;
		}
	}
	
	private Node root;
	//insert root element:
	public void populate(Scanner scanner) {
		System.out.println("Enter the root Node : ");
		int value = scanner.nextInt();
		root = new Node(value);
		populate(scanner, root);
	}
	
	//insert children
	public void populate(Scanner scanner, Node node) {

		//insert left
		System.out.println("Do you want to add left of the node "+node.data);
		boolean left = scanner.nextBoolean();
		if(left) {
			System.out.println("Enter the left node value of "+node.data);
			int value = scanner.nextInt();
			node.left = new Node(value);
			populate(scanner, node.left);
		}
		
		//insert right
		System.out.println("Do you want to add right of the node "+node.data);
		boolean right = scanner.nextBoolean();
		if(right) {
			System.out.println("Enter the right node value of "+node.data);
			int value = scanner.nextInt();
			node.right = new Node(value);
			populate(scanner,node.right);
		}
	}
	
	public void display() {
		prettyDisplay(this.root,0);
	}
	private void prettyDisplay(Node node, int level) {
		if(node == null) {
			return;
		}
		prettyDisplay(node.right,level+1);
		if(level!=0) {
			for(int i = 0;i<level-1;i++) {
				System.out.print("|\t");
			}
			System.out.println("|------>"+node.data);
		}
		else {
			System.out.println(node.data);
	
		}
		prettyDisplay(node.left,level+1);
	}
}
