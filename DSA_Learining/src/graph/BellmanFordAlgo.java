package graph;
import java.util.*;
public class BellmanFordAlgo {
	//sr => source.
	private static void bellmanAlgo(int V, int[][]edges, int sr) {
		int[] distance = new int[V];
		Arrays.fill(distance, (int)1e8);
//		System.out.println(Arrays.toString(distance));
//		for(int i = 0;i<distance.length;i++) {
//			distance[i] = (int)1e8; //10^8
//		}
		
		//first node always have 0 weight , thats why i'm assigning 0 here.
		distance[sr] = 0;
		
		//distance[0, 1e8, 1e8, 1e8, 1e8];
		System.out.println(Arrays.toString(distance));
		for(int i = 0;i<V;i++) { // path-> possible weights
			for(int[] path : edges) {
				int startVertex = path[0];
				int endVertex = path[1];
				int weight = path[2];
				// without these three we cannot compute new weight.
				
				/*
				 * 1 2 1
                   1 3 2
                   2 4 1
                   4 3 -1
                   0 1 5
				 * sv = 1, ev = 2, w = 1 //false
				 * sv = 1, ev = 3, w = 2 //false
				 * sv = 2, ev = 4, w = 1 //false
				 * sv = 4, ev = 3, w = -1 //false
				 * sv = 0, ev = 1, w = 5 //true
				 */
				
				if(distance[startVertex]!=1e8 && distance[startVertex]+weight < distance[endVertex]) {
					//distance[0] != 1e8 && distance[0] + 5 < distance[endVertex]
					//0!=1e8 &&   0 + 5 < 1e8
					// true && true
					distance[endVertex] = distance[startVertex]+weight;
					// distance[1] = distance[0] + 5
					// distance[1] = 0+5 = 5
				}
			}
		}
		System.out.println(Arrays.toString(distance));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of Vertices & Edges you need : ");
		int V = in.nextInt(); // 5
		int E = in.nextInt(); // 5
		int[][] edges = new int[E][3]; //[5][3]
		
		/*
		 * Vertices=5 , edges = 5
		 * 0 1 2
		 * 0 -> 1 3 2  sr ,ds, w
		 * 1 -> 4 3 -1
		 * 2 -> 2 4 1
		 * 3 -> 1 2 1
		 * 4 -> 0 1 5
		 */
		
		
		System.out.println("Enter the vertex, edge and weight : ");
		for(int i = 0; i < E; i++) {
			int sr = in.nextInt();
			int ds = in.nextInt();
			int weight = in.nextInt();
			edges[i][0] = sr;
			edges[i][1] = ds;
			edges[i][2] = weight;
		}
		
		for(int i = 0;i<E;i++) {
			System.out.println(edges[i][0]+" "+edges[i][1]+" "+edges[i][2]+" ");
		}
		
		bellmanAlgo(V, edges, 0);
		

	}

}
