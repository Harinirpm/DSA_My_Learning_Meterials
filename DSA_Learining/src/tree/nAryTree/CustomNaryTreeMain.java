package tree.nAryTree;
import java.util.Scanner;
public class CustomNaryTreeMain {

	public static void main(String[] args) {
		CustomNaryTree tree = new CustomNaryTree();
		Scanner scanner = new Scanner(System.in);
		tree.populate(scanner);
		tree.display();

	}

}
