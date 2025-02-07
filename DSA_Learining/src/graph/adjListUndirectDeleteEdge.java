package graph;
import java.util.*;
public class adjListUndirectDeleteEdge {
	
	private static void removeEdge(List<List<Integer>>outer , int sr, int ds) {
		/*
		 * sr = 1 , ds = 4
		 * sr = 4 , ds = 1
		 */
		// traversing source to destination if the value is present we then remove it.
		for(int i = 0;i<outer.size();i++) {
			if(outer.get(sr).get(i) == ds) {
				outer.get(sr).remove(i);
				break;
			}
		}
		
		// traversing destination to source , if the value is present then we remove it.
		for(int i = 0;i<outer.size();i++) {
			if(outer.get(ds).get(i)==sr) {
				outer.get(ds).remove(i);
				break;
			}
		}
	}
	
	private static void traverse(List<List<Integer>>outer) {
		for(int i= 0;i<outer.size();i++) {
			System.out.print(i);
			for(int j = 0;j<outer.get(i).size();j++) {
				System.out.print(" -> "+ outer.get(i).get(j));
			}
			System.out.println();
		}
	}
	private static void addEdge(List<List<Integer>>outer, int sr, int ds) {
		outer.get(sr).add(ds);
		outer.get(ds).add(sr);
//		System.out.println(outer);
	}

	public static void main(String[] args) {
		List<List<Integer>> outer = new ArrayList<>();
		int vertex = 5;
		for(int i = 0; i < vertex; i++) {
			List<Integer> inner = new ArrayList<>();
			outer.add(inner);
		}
		
		addEdge(outer, 0, 1);
		addEdge(outer, 0, 4);
//		addEdge(outer, 1, 0);
		addEdge(outer, 1, 2);
		addEdge(outer, 1, 3);
		addEdge(outer, 1, 4);
//		addEdge(outer, 2, 1);
		addEdge(outer, 2, 3);
		addEdge(outer, 3, 4);
		
		System.out.println(outer);
		System.out.println("------------Before removing the edges------");
		traverse(outer);
		
		removeEdge(outer, 1, 4);
		System.out.println("-------------After removing the edges-------");
		traverse(outer);

	}

}
