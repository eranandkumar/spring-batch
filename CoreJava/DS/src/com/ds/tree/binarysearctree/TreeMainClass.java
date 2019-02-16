package com.ds.tree.binarysearctree;

public class TreeMainClass {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree ();
        binarySearchTree.insert ( 30 );
        binarySearchTree.insert ( 52 );
        binarySearchTree.insert ( 55 );
        binarySearchTree.insert ( 20 );
        binarySearchTree.insert ( 10 );
        binarySearchTree.insert ( 70 );
        binarySearchTree.insert ( 12 );
        binarySearchTree.insert ( 33 );

        binarySearchTree.traverseInOrder ();
        System.out.println ();
        System.out.println (binarySearchTree.get ( 70 ) );
        System.out.println ("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        System.out.println ("Min - " +binarySearchTree.getMinValue () );
        System.out.println ("Max - " +binarySearchTree.getMaxValue () );
    }


}
