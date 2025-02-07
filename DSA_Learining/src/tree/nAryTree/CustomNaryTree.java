package tree.nAryTree;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CustomNaryTree {
	CustomNaryTree() {}
	    // Node
	    private class Node {
	        int data;
	        List<Node> children;
	        
	        public Node(int data) {
	            this.data = data;
	            this.children = new ArrayList<>();
	        }
	    }

	    private Node root;

	    // Insert root element
	    public void populate(Scanner scanner) {
	        System.out.println("Enter the root Node: ");
	        int value = scanner.nextInt();
	        root = new Node(value);
	        populate(scanner, root);
	    }

	    // Insert children
	    private void populate(Scanner scanner, Node node) {
	    	System.out.println("Do you want to add children for the node of "+node.data+ " ? ");
	    	boolean confirm = scanner.nextBoolean();
	    	if(confirm) {
	        System.out.println("Enter the number of children for node " + node.data + ": ");
	        int numChildren = scanner.nextInt();

	        for (int i = 0; i < numChildren; i++) {
	            System.out.println("Enter value for child " + (i + 1) + " of node " + node.data + ": ");
	            int value = scanner.nextInt();
	            Node child = new Node(value);
	            node.children.add(child);
	            populate(scanner, child);
	        }
	    	}
	    }

	    public void display() {
	        prettyDisplay(root, 0);
	    }

	    private void prettyDisplay(Node node, int level) {
	        if (node == null) {
	            return;
	        }
	        
	        for (int i = 0; i < level; i++) {
	            System.out.print("|	");
	        }
	        System.out.println("|----> " + node.data);
	        
	        for (Node child : node.children) {
	            prettyDisplay(child, level + 1);
	        }
	    }
}
