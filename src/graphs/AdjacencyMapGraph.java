package graphs;

import java.util.*;

public class AdjacencyMapGraph<T> {
    HashMap<T, Vertex> vertices = new HashMap<>();

    public int num() {
        return this.vertices.size();
    }

    public boolean contains(String name) {
        return this.vertices.containsKey(name);
    }

    public void addVertex(T value) {
        vertices.put(value, new Vertex(value));
    }

    public int numEdges() {
        int count = 0;

        for (Vertex vtx : vertices.values()) {

            count = count + vtx.neighbours.size();


        }
        return count / 2;
    }

    public boolean containsEdge(T first, T second) {
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);
        if (f == null || s == null || !f.neighbours.containsKey(s)) {
            return false;
        }
        return true;
    }

    public void addEdge(T first, T second, int cost) {
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);
        if (f == null || s == null || f.neighbours.containsKey(s)) {
            return;
        }
        f.neighbours.put(s, cost);
        s.neighbours.put(f, cost);

    }

    public void removeEdge(T first, T second) {
        Vertex f = vertices.get(first);
        Vertex s = vertices.get(second);
        if (f == null || s == null || !f.neighbours.containsKey(s)) {
            return;
        }
        f.neighbours.remove(s);
        s.neighbours.remove(f);


    }

    public void removeVertex(T name) {
        Vertex v = vertices.get(name);
        for (Vertex vtx : vertices.values()) {
            vtx.neighbours.remove(v);
        }
        vertices.remove(name);
    }

    public boolean hasPath(T start, T end, HashMap<T, Boolean> processed) {
        processed.put(start, true);
        if (containsEdge(start,end)){
        return true;
        }

        Vertex v = vertices.get(start);
        for (Vertex vtx : v.neighbours.keySet()) {
            if (!processed.containsKey(vtx.value) && hasPath(vtx.value, end, processed)) {
                return true;
            }
        }
        return false;

    }
    class pair{
       T vname;
        T psf;

    }
    public void bfs(T first,T second){
        Queue<pair> queue=new LinkedList<>();
        HashMap<T,Boolean> processed=new HashMap<>();
        pair sp=new pair();
        sp.vname=first;
        sp.psf=  first;
        queue.add(sp);
        while(!queue.isEmpty()){
                pair rp=queue.remove();
                if(processed.containsKey(rp.vname)){
                    continue;
                }
                processed.put(rp.vname,true);

                     if(containsEdge(rp.vname,second)){
                         System.out.println(rp.psf+""+second);
                       //  return true;
                     }
                     Vertex rpvtx=vertices.get(rp.vname);
                     for(Vertex vtx:rpvtx.neighbours.keySet()){
                         if(!processed.containsKey(vtx.value)){
                             pair np=new pair();
                             np.vname=vtx.value;
                             np.psf= (T) (rp.psf+""+vtx.value);
                             queue.add(np);

                         }
                     }
        }
      //  return false;
    }

    public boolean dfs(T first , T second){
        Stack<pair> stack=new Stack<>();
        HashSet<T> processed=new HashSet<>();
        pair sp=new pair();
        sp.vname=first;
        sp.psf=first;
        stack.push(sp);
      while(!stack.isEmpty()) {

          pair rp = stack.pop();
          if (processed.contains(rp.vname)) {
              continue;
          }

          processed.add(rp.vname);
          if (containsEdge(rp.vname, second)) {
              System.out.println(rp.psf+""+second);
              return true;
          }
          Vertex vtx = vertices.get(rp.vname) ;
              for (Vertex v : vtx.neighbours.keySet()){
                  if(!processed.contains(v.value)){
                      pair np=new pair();
                      np.vname=v.value;
                      np.psf= (T) (rp.psf+""+v.value);
                      stack.push(np);
                  }
              }


          }

         return false;
      }

      public void bft(T first,T second) {
          HashSet<T> processed = new HashSet<>();
          Queue<pair> queue = new LinkedList<>();
          for (T key : vertices.keySet()) {
          if(processed.contains(key)){
              continue;
          }
          pair sp = new pair();
          sp.vname = key;
          sp.psf = key;
          queue.add(sp);
          while (!queue.isEmpty()) {
              pair rp = queue.remove();
              if (processed.contains(rp.vname)) {
                  continue;
              }
              processed.add(rp.vname);
              System.out.println(rp.vname+" "+rp.psf);
              Vertex v = vertices.get(rp.vname);
              for (Vertex vtx : v.neighbours.keySet()) {
                  pair np = new pair();
                  np.vname = vtx.value;
                  np.psf = (T) (rp.psf + "" + vtx.value);
                  queue.add(np);
              }
          }
      }
      }
    public boolean isCyclic() {
        HashSet<T> processed = new HashSet<>();
        Queue<pair> queue = new LinkedList<>();
        for (T key : vertices.keySet()) {
            if(processed.contains(key)){
                continue;
            }
            pair sp = new pair();
            sp.vname = key;
            sp.psf = key;
            queue.add(sp);
            while (!queue.isEmpty()) {
                pair rp = queue.remove();
                if (processed.contains(rp.vname)) {
                    return true;
                }
                processed.add(rp.vname);
              //  System.out.println(rp.vname+" "+rp.psf);
                Vertex v = vertices.get(rp.vname);
                for (Vertex vtx : v.neighbours.keySet()) {
                    pair np = new pair();
                    np.vname = vtx.value;
                    np.psf = (T) (rp.psf + "" + vtx.value);
                    queue.add(np);
                }
            }
        }
        return false;
    }
    public ArrayList<ArrayList<T>>  connectedComponents() {
        ArrayList<ArrayList<T>> result=new ArrayList<>();
        HashSet<T> processed = new HashSet<>();
        Queue<pair> queue = new LinkedList<>();
        for (T key : vertices.keySet()) {
            if(processed.contains(key)){
                continue;
            }
            ArrayList<T> ans=new ArrayList<>();
            pair sp = new pair();
            sp.vname = key;
            sp.psf = key;
            queue.add(sp);
            while (!queue.isEmpty()) {
                pair rp = queue.remove();
                if (processed.contains(rp.vname)) {
                    continue;
                }
                processed.add(rp.vname);
                ans.add(rp.vname);
                //  System.out.println(rp.vname+" "+rp.psf);
                Vertex v = vertices.get(rp.vname);
                for (Vertex vtx : v.neighbours.keySet()) {
                    pair np = new pair();
                    np.vname = vtx.value;
                    np.psf = (T) (rp.psf + "" + vtx.value);
                    queue.add(np);
                }
            }
            result.add(ans);
        }

        return result;
    }




    public void display() {

        for (Vertex vertex : vertices.values()) {

            System.out.print(vertex.value + " => ");

            for (Vertex padosi : vertex.neighbours.keySet()) {

                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private class Vertex {
        T value;
        HashMap<Vertex, Integer> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new HashMap<>();
        }
    }

}
