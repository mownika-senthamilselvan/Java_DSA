package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        BinaryTree tree=new BinaryTree();
//        System.out.println("Binary Tree:");
//        tree.populate(sc);
//        tree.display();
//        tree.preOrder();

        BST tree1 = new BST();
        int[] nums = { 15,10,5,3};
        tree1.populate(nums);
        tree1.display();


    }
}
