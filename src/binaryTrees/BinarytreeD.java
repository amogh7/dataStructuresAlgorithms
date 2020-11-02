package binaryTrees;

import java.util.Scanner;

public class BinarytreeD {
    Scanner sc=new Scanner(System.in);
    class Node{
        int data;
        Node left;
        Node right;
    }
    Node root;
    public BinarytreeD(){
       root= takeInput(null,false);
    }
    private Node takeInput(Node parent,boolean ilc){
        if(parent==null){
            System.out.println("Enter the value of the root node");

        }
        else{
            if(ilc){
                System.out.println("Enter the value for left child of "+ parent.data);

            }
            else{
                System.out.println("Enter the value for right child of "+ parent.data);
            }
        }
        int item =sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        System.out.println(nn.data+"has left chld ? ");
        boolean hlc=sc.nextBoolean();
        if(hlc){
           nn.left= takeInput(nn,true);
        }
        System.out.println(nn.data+"has right child ? ");
        boolean rlc =sc.nextBoolean();
        if(rlc){
            nn.right=takeInput(nn,false);
        }
        return nn;


    }
    public void display(){
        display(root);
    }
    public void display(Node node){
        if(node==null){
            return;
        }
        String str="";
        if(node.left==null){
            str=str+".";
        }
        else{
            str=str+node.left.data;
        }
        str=str+"->"+node.data+"<-";
        if(node.right==null){
            str=str+".";
        }
        else{
            str=str+node.right.data;
        }
        System.out.println(str);
        display(node.left);
        display(node.right);

    }
}

