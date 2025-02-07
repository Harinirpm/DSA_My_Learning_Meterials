package graph;
import java.util.*;
class Edge {
	int vertex; //instance variable
	int weight;
	
	Edge(int vertex, int weight){ //local variable.
		this.vertex = vertex; // this.vertex(instance  v) = vertex ( local variable)
		this.weight = weight; // JVM will differentiate the local & instance variable by
		                        // using 'this' keyword.
	}
}
public class Dijkshitra {
	
	static void dijkshitraAlgo(List<List<Edge>> outer, int src, int vertex) {
	int[] distance = new int[vertex]; // 0,1,2 
	Arrays.fill(distance, Integer.MAX_VALUE); //[max, max, max]
	
	distance[src] = 0; // start node 'src'. 'distance' -> calculated weights stored here.
	//create a Queue {island, flood fill}
	Queue<int[]> q = new ArrayDeque<>();  // create a 1D array in queue.
	int[] arr = {src,0}; // storing 'src'(starting node} vertex and athoda 'weight'
	//q[[2,0]] => size of queue 1. q[[src,weight]]
	q.add(arr);
	while(!q.isEmpty()) {
		int prev_vertex = q.peek()[0]; // vertex  a = 2
		int prev_weight = q.peek()[1]; // weight  b = 0
		q.poll();
		
		//traverse the object , we have to use for each loop.
		for(Edge e : outer.get(prev_vertex)) {  // accessing edge that is present in inner class of outer class
			//[[[1,1],[2,6]],[[2,3],[0,1]],[[1,3],[0,6]]
			int curr_vertex = e.vertex; //vertex = 1
			int curr_weight = e.weight; // vertex = 3
			if(distance[curr_vertex] > curr_weight+prev_weight) {
				distance[curr_vertex] = curr_weight+prev_weight;
				int temp[] = {curr_vertex, distance[curr_vertex]};
				q.add(temp);
			}
		}
	}
	System.out.println("All Possible weights.");
	System.out.println(Arrays.toString(distance));
	
	}

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the Verices and edges : ");
		 int V = in.nextInt();
		 int E = in.nextInt();
		 List<List<Edge>> outer = new ArrayList<>(); // we are storing the objects 'Edge' type
		 for(int i = 0;i < V; i++) {
			 List<Edge> inner = new ArrayList<>();
			 outer.add(inner);
//			 System.out.println(outer);
		 }
// add the edges
		 //
		 for(int i = 0;i < E;i++) {
			 System.out.println("Enter source, destination, and weight : ");
			 int src = in.nextInt();
			 int dest = in.nextInt();
			 int weight = in.nextInt();
			 
			 Edge obj1 = new Edge(dest,weight); // without objects also we can create a edge.
			 // i need to store multiple data's so that i am creating object.
			 Edge obj2 = new Edge(src,weight);
			 outer.get(src).add(obj1);
			 outer.get(dest).add(obj2);
		 }
		 System.out.println("Enter starting node : ");
		 int source = in.nextInt(); //source is 2
		 dijkshitraAlgo(outer, source, V);
	}

	

}
