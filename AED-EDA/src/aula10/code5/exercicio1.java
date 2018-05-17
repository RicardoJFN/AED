package aula10.code5;

import aula06.code3.LibStack;

public class exercicio1 {

    public static void main(String[] args) {

        int[] data = {14, 4, 18, 3, 9, 16, 20, 7, 15, 17, 5};
        int[] data2 = {10,2,9,1,4,5,3};
        BSTree<Integer,Integer> t = new BSTree<Integer,Integer>();
        for(int i = 0 ; i < data.length ; i++ )
            LibBSTree.insert(t, data[i], data[i]);


        System.out.println("size:  " + LibBSTree.size(t));
        System.out.println("depth: " + LibBSTree.depth(t));
        System.out.println(LibBSTree.sum(t));
        System.out.println("greater than: " + LibBSTree.keysGreaterThan(t, 16));

        printInOrder(t);
        printPreOrder(t);
        printPostOrder(t);


        BSTree<Integer,Integer> t2 = new BSTree<Integer,Integer>();
        for(int i = 0 ; i < data2.length ; i++ )
            LibBSTree.insert(t2, data2[i], data2[i]);
        System.out.println("size:  " + LibBSTree.size(t2));
        System.out.println("depth: " + LibBSTree.depth(t2));
        System.out.println(LibBSTree.sum(t2));
        System.out.println("min: " + LibBSTree.minimum(t));

        printInOrder(t2);
        printPreOrder(t2);
        printPostOrder(t2);

    }

    static void printInOrder(BSTree<Integer, Integer> t) {
        printInOrder(t.root);
        System.out.println();
    }

    static void printInOrder(BSTNode<Integer, Integer> n) {
        if (n!=null) {
            printInOrder(n.left);
            System.out.print(n.key + " ");
            printInOrder(n.right);
        }
    }

    static void printPreOrder(BSTree<Integer, Integer> t) {
        printPreOrder(t.root);
        System.out.println();
    }

    static void printPreOrder(BSTNode<Integer, Integer> n) {
        if (n!=null) {
            System.out.print(n.key + " ");
            printPreOrder(n.left);
            printPreOrder(n.right);
        }
    }

    static void printPostOrder(BSTree<Integer, Integer> t) {
        printPostOrder(t.root);
        System.out.println();
    }

    static void printPostOrder(BSTNode<Integer, Integer> n) {
        if (n!=null) {
            printPostOrder(n.left);
            printPostOrder(n.right);
            System.out.print(n.key + " ");
        }
    }

}
