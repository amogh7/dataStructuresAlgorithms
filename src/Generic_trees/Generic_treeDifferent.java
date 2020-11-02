package Generic_trees;

import java.util.ArrayList;
import java.util.Scanner;

public class Generic_treeDifferent {
    Scanner sc=new Scanner(System.in);
    class Node{
        int data;
        ArrayList<Node> children =new ArrayList<>();

    }
    private Node root;
    public Generic_treeDifferent(){

        root =construct(null,-1);
    }

    private Node construct(Node parent, int i) {
        if(parent==null){
            System.out.println("Enter data for root node");
        }
        else {
            System.out.println("Enter data for " + i + "th child of " + parent.data + "?");
        }
        int item =sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        System.out.println("Enter the number of children for " +nn.data+" ?");
        int noc=sc.nextInt();
        for(int j=0;j<noc;j++){
            Node child=construct(nn,j);
            nn.children.add(child);

        }
        return nn;
    }
    public void Display(){
        Display( root);
    }
    private void Display(Node node){
        String str=node.data+"->";
        for(Node val :node.children){
            str=str+val.data+" ";
        }
        str=str+".";
        System.out.println(str);
        for(Node val:node.children){
            Display(val);
        }

    }

}
