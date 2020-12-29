package com.lovetocode.trees.bst;

public class TestBst {

    public static void main( String[] args ) {
        BinarySearchTree bst = new BinarySearchTree ();
        bst.insert (7);
        bst.insert (1);
        bst.insert (9);
        bst.insert (3);
        bst.insert (8);
        bst.insert (6);

        System.out.println ("Remove "+ bst.remove (1));
        System.out.println ("printing In Order..! ");
        bst.printInOrder (bst.root);
        System.out.println ();
        System.out.println ("printing Pre Order..! ");
        bst.printPreOrder (bst.root);
        System.out.println ();
        System.out.println ("Find Value "+ bst.find (7));

    }
}
