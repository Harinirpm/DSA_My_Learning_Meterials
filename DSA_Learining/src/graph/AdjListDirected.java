package graph;

import java.util.ArrayList;
import java.util.List;

public class AdjListDirected {
	private static void traverse(List<List<Integer>> outer) {
		for(int i = 0 ;i < outer.size(); i++) {
			System.out.print(i);
			for(int j = 0;j<outer.get(i).size(); j++) {
				System.out.print(" -> "+ outer.get(i).get(j));
			}
			System.out.println("");
		}
	}
	private static void addEdge(List<List<Integer>> outer, int src, int dest) {
		/*
		 * sr = 0 , des = 2
		 * sr = 0 , des = 3
		 * sr = 1 , des = 0
		 * sr = 2 , des = 1
		 * sr = 3 , des = 4
		 * sr = 4 , des = 0
		 */
		
		outer.get(src).add(dest);
		System.out.println(outer);
		
	}

	public static void main(String[] args) {
List<List<Integer>> outer = new ArrayList<>();
		
		int vertex = 5;
		//add vertex or nodes
		for(int i = 0;i<vertex;i++) {
			List<Integer> inner = new ArrayList<>();
			outer.add(inner);
		}
//		System.out.println(outer);
		
		//add edges 
		addEdge(outer, 0, 2);
		addEdge(outer, 0, 3);
		addEdge(outer, 1, 0);
		addEdge(outer, 2, 1);
		addEdge(outer, 3, 4);
		addEdge(outer, 4, 0);
		
		traverse(outer);

	}

}
