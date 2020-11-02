package graphs;

import java.util.*;

public class AdjacencyListGraph {
    LinkedList<Vertex> vertices = new LinkedList<>();

    class Vertex {
        String value;
        LinkedList<Vertex> neighbour;

        public Vertex(String value) {
            this.value = value;
            this.neighbour = new LinkedList<>();
        }

    }

    public void addVertex(String value) {
        vertices.add(new Vertex(value));
    }

    public void addEdge(String first, String second) {
        Vertex f = find(first);
        Vertex s = find(second);
        if (f != null && s != null) {
            f.neighbour.add(s);
            s.neighbour.add(f);
        }
    }

    public Vertex find(String name) {
        for (Vertex vertex : vertices) {
            if (vertex.value.equals(name)) {
                return vertex;

            }

        }
        return null;
    }
    public void Bft() {
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        Vertex vertex = vertices.get(0);
        visited.add(vertex);
        queue.add(vertex);
        while (!queue.isEmpty()) {
            Vertex temp = queue.remove();
            System.out.println(temp.value);
            for (Vertex padosi : temp.neighbour) {
                if (!visited.contains(padosi)) {
                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }
    }
        public void Dft(){
            Set<Vertex> visited=new HashSet<>();
            Stack<Vertex> stack=new Stack<>();
            Vertex vertex=vertices.get(0);
            visited.add(vertex);
            stack.push(vertex);
            while(!stack.isEmpty()){
                Vertex temp=stack.pop();
                System.out.println(temp.value);
                for (Vertex padosi:temp.neighbour) {
                    if(!visited.contains(padosi)){
                        stack.push(padosi);
                        visited.add(padosi);
                    }
                }
            }

        }


        public int GetConnectedComponents(){
        HashSet<Vertex> visited=new HashSet<>();
        Queue<Vertex> queue=new LinkedList<>();
        int count=0;
        for(Vertex v:vertices){
            if(visited.contains(v)){
                continue;
            }
            count++;
            visited.add(v);
            queue.add(v);
            while(!queue.isEmpty()){
                Vertex temp=queue.remove();
                System.out.print(temp.value+" ");
                for (Vertex padosi:temp.neighbour) {
                    if(!visited.contains(padosi)){
                        queue.add(padosi);
                        visited.add(padosi);
                    }
                }
            }
            System.out.println();

        }
            return count;
        }
public boolean isConnected(){
        int count=GetConnectedComponents();
        if(count>=2){
            return false;
        }
        return true;
}
        public boolean hasPath(String start,String end,HashMap<String,Boolean> processed){
        processed.put(start,true);
        if(start.equals(end)){
            return true;
        }
        Vertex v=find(start);
        for(Vertex vtx:v.neighbour){
            if(!processed.containsKey(vtx.value)&&hasPath(vtx.value,end,processed)){
                return true;
            }
        }
        return false;
        }
        public boolean isBipartite(){
        HashSet<Vertex> isvisited=new HashSet<>();
        Queue<Vertex> queue=new LinkedList<>();
        Set<Vertex> red=new HashSet<>();
            Set<Vertex> green=new HashSet<>();
            Vertex v=vertices.get(0);
            red.add(v);
            queue.add(v);
            isvisited.add(v);
            while(!queue.isEmpty()){
                Vertex temp=queue.remove();
                if(red.contains(temp)) {
                    for (Vertex vtx : temp.neighbour) {
                        if (!isvisited.contains(vtx)) {
                            green.add(vtx);
                            queue.add(vtx);
                            isvisited.add(vtx);
                        } else {
                            if (red.contains(vtx)) {
                                return false;
                            }
                        }
                    }
                }
                    if(green.contains(temp)) {
                        for (Vertex vtx : temp.neighbour) {
                            if (!isvisited.contains(vtx)) {
                               red.add(vtx);
                                queue.add(vtx);
                                isvisited.add(vtx);
                            } else {
                                if (green.contains(vtx)) {
                                    return false;
                                }
                            }
                        }


                    }
            }
            return true;


        }


    public void display(){
        for(Vertex vertex:vertices) {
            System.out.print(vertex.value + " => ");

            for (Vertex padosi : vertex.neighbour) {
                System.out.print(padosi.value+" ");
            }
            System.out.println();
        }

    }
}