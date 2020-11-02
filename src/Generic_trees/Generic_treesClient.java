package Generic_trees;

import java.util.Scanner;

public class Generic_treesClient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Generic_trees tree =new Generic_trees();
     tree.insert(sc);
//        tree.Display();
//        System.out.println(tree.count());
//        System.out.println(tree.max());
        tree.levelOrder();

    }
}
