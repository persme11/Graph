import java.util.LinkedList;

public class Graph{
	
	private int v;
	private LinkedList<Integer> adjLinkedList[];

	Graph(int v){
		
		this.v = v;
		adjLinkedList = new LinkedList[v];

		for(int i = 0; i < v; i++){

			adjLinkedList[i] = new LinkedList<>();

		}

	}

	public void addEdge(Graph graph, int src, int des){

		graph.adjLinkedList[src].add(des);
		graph.adjLinkedList[des].add(src);

	}

	public void print(Graph graph){
		for(int i = 0; i < graph.v; i++){

			System.out.println("Adjacency list of vertex " + i);
			for(Integer iter:graph.adjLinkedList[i]){

				System.out.print("->" + iter);

			}
			System.out.println("\n");

		}

	}

	public static void main(String args[]){
		int V = 5;
		Graph graph = new Graph(V);

		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        graph.print(graph);

	}


}