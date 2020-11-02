package graphs;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;

public class client {
    public static void main(String[] args) {
        AdjacencyMapGraph<String> graph=new AdjacencyMapGraph<>();
       graph.addVertex("A");

        graph.addVertex("C");
        graph.addVertex("B");
        graph.addVertex("D");
     //   graph.addVertex("E");
        graph.addEdge("A","C",1);
        graph.addEdge("C","D",1);


      // graph.addEdge("A","D",1);

        graph.addEdge("B","D",1);

        graph.addEdge("A","B",1);


        graph.display();
//        System.out.println( graph.numEdges());
//        graph.removeVertex("A");
//        graph.display();
//            graph.removeEdge("A","D");
//        graph.display();
//        System.out.println( graph.numEdges());
//        graph.removeVertex("A");
//        graph.display();
//        System.out.println( graph.numEdges());
//
//        graph.removeEdge("A","B");
//        System.out.println(graph.hasPath( "A","D",new HashMap<String,Boolean>()));
        graph.dfs("A","D");
     //   graph.bft("A","D");
       // System.out.println(graph.connectedComponents());

    }

}
