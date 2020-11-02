package graphs;

import java.util.HashMap;

public class client2list {
    public static void main(String[] args) {
        AdjacencyListGraph graph=new AdjacencyListGraph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdge("B","D");
        graph.addEdge("C","D");
        graph.addEdge("A","C");
        graph.addEdge("A","B");
        graph.addEdge("A","D");





       // graph.display();
       // graph.Bft();
      //  System.out.println(graph.hasPath("A","B",new HashMap<String ,Boolean>()));
        System.out.println(graph.isBipartite());
//        System.out.println(graph.GetConnectedComponents());
//        System.out.println(graph.isConnected());
    }
}
