package tree.binarySearchTree;

public class BSTMain {

	public static void main(String[] args) {
		BST bst = new BST();
//		bst.insert(5);
//		bst.insert(6);
//		bst.insert(23);
//		bst.insert(10);
//		bst.insert(14);
//		bst.insert(25);
		bst.display();
		int[] nums = {1,2,8,9,5,6,7,3,4,1};
		bst.populate(nums);
		bst.display();
		

	}

}
