package binaryTrees;

import java.util.Scanner;

public class BinarytreeClient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Binarytrees tree=new Binarytrees();
        tree.insert(sc);
        tree.insert(sc);
        tree.insert(sc);
        tree.Display();

    }
}
