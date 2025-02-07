package graph;
import java.util.*;
public class AdjListUndirected {

	private static void traverse(List<List<Integer>>outer) {
		// outer loop traverse outer arrayList.
		for(int i = 0; i < outer.size(); i++) {
			System.out.print(i);
			//inner loop traverse inner arrayList
			for(int j = 0; j < outer.get(i).size(); j++) {
				System.out.print(" -> " + outer.get(i).get(j));
			}
			System.out.println("");
		}
	}
	private static void addEdge(List<List<Integer>> outer, int src, int dest) {
		/*
		 * sr = 0 , des = 1
		 * sr = 0 , des = 2
		 * sr = 1 , des = 2
		 * sr = 2 , des = 3
		 */
		
		outer.get(src).add(dest);
//		System.out.println(outer);
		outer.get(dest).add(src);
//		System.out.println(outer);
		
	}
	public static void main(String[] args) {
		List<List<Integer>> outer = new ArrayList<>();
		
		int vertex = 4;
		//add vertex or nodes
		for(int i = 0;i<vertex;i++) {
			List<Integer> inner = new ArrayList<>();
			outer.add(inner);
		}
//		System.out.println(outer);
		
		//add edges 
		addEdge(outer, 0, 1);
		addEdge(outer, 0, 2);
		addEdge(outer, 1, 2);
		addEdge(outer, 2, 3);
		
		//printing the vertices.
		traverse(outer);
	}

}
