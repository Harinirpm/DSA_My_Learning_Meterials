package tree.customTree;
import java.util.Scanner;
public class BinaryTreeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		tree.populate(scanner);
		tree.display();

	}

}
