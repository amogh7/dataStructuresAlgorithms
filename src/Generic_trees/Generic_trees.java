package Generic_trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Generic_trees {
    private Node root;
    public void insert(Scanner sc){
        System.out.println("Enter value of root node " );
        int n=sc.nextInt();
        this.root=new Node(n);
        insert(root,sc);

    }
    public void insert(Node node,Scanner sc){
        while(true){
            System.out.println("Do you want a child of " +node.value);
                boolean yes =sc.nextBoolean();
                if(yes){
                    System.out.println("Enter the value ");
                    int val=sc.nextInt();
                    Node child =new Node(val);
                    node.children.add(child);
                    insert(child,sc);
                }
                else{
                    break;
                }
            }
    }
    public void Display(){
        Display(root,"");
    }
    private void Display(Node node,String indent) {
        System.out.println(indent+node.value);
        for(Node val:node.children){
            Display(val,indent+"\t");
        }

    }
    public int  count(){
        return count(root);
    }
    public int count(Node node){
        int cnt=1;
        for(int i=0;i<node.children.size();i++){
            cnt=cnt+count(node.children.get(i));
        }
        return cnt;
    }
    public boolean find (Node node,int data){
        if(node.value==data){
            return true;
        }
        for(Node child:node.children){
            boolean fic=find(child,data);
            if(fic){
                return true;
            }

        }
        return false;
    }
    public int max(){

       return  max(root,0);
    }
    public int max(Node node,int max){
        if(max<node.value){
            max=node.value;
        }
        for(Node val:node.children){
            max=max(val,max);
        }
        return max;


    }
    public void levelOrder(){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp=queue.remove();
            System.out.println(temp.value);
            for(Node val:temp.children){
                queue.add(val);
            }
        }
    }
    public void atLevel(int k){
        atLevel(root,k);
    }
    public void atLevel(Node node,int k){
        if(k==0){
            System.out.println(node.value);
            return;
        }
        for(int i=0;i<node.children.size();i++){
            atLevel(node.children.get(i),k-1);
        }
    }
public int height(){
        return height(root);
}
public int height(Node node){
        int ht=0;
        for(Node val:node.children){
            int ch=height(val);
             ht=Math.max(ch,ht);
        }
        return ht+1;
}




    class Node{
        int value;
        ArrayList<Node> children;
        public Node(int value){
            this.value=value;
            this.children=new ArrayList<>();
        }

    }
}
