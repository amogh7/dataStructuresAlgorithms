package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binarytrees {
    private Node root;


    public void insert(Scanner sc) {

        this.root = insert(root, sc);
    }

    public Node insert(Node node, Scanner sc) {
        if (node == null) {
            System.out.println("Enter the value");
            int val = sc.nextInt();
            return new Node(val);

        }
        System.out.println("Enter the direction");
        String dir = sc.next();
        if (dir.equals("left")) {
            node.left = insert(node.left, sc);
        } else {
            node.right = insert(node.right, sc);
        }
        return node;

    }
    public boolean find(int value){
      return  find(root,value);
    }
    private boolean find(Node node,int value){
        if(node==null){
            return false;
        }
        if(node.value==value){
            return true;
        }
        return find(node.left,value)||find(node.right,value);
    }



    public void Display() {
        Display(root, "");
    }

    public void Display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        Display(node.left, indent + "\t");
        Display(node.right, indent + "\t");

    }

    public void Inorder() {
        Inorder(root, "");

    }

    private void Inorder(Node node, String indent) {
        if (node == null) {
            return;
        }

        Inorder(node.left, indent + "\t");
        System.out.println(indent + node.value);
        Inorder(node.right, indent + "\t");
    }

    public void post() {
        post(root, "");

    }

    private void post(Node node, String indent) {
        if (node == null) {
            return;
        }

        post(node.left, indent + "\t");

        post(node.right, indent + "\t");
        System.out.println(indent + node.value);
    }

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.println(temp.value);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public int height() {
        return height(root);

    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;

    }

    public int diameter() {
        return diameter(root);

    }

    private int diameter(Node node) {
          if(node==null){
              return 0;
          }
          int curr=height(node.right)+height(node.right)+1;
          int max=Math.max(diameter(node.left),diameter(node.right));
          return Math.max(curr,max);
    }
    public void mirror(){
        mirror(root);
    }
    private void mirror(Node node){
        if(node==null){
            return;
        }


       Node temp=node.left;
       node.left=node.right;
       node.right=temp;
        mirror(node.left);
        mirror(node.right);
    }

    class Node {
        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }

    }


}