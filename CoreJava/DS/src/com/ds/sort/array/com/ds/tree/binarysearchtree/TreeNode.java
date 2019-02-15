package com.ds.sort.array.com.ds.tree.binarysearchtree;

public class TreeNode {
    private int rootNode;
    private TreeNode leftChild;
    private TreeNode rightChild;



    public TreeNode(int data) {
        this.rootNode = data;
    }


    /*
     @value means the number which we are inserting in treenode
     @Data means Assume data is treenode
     value is less than rootnode means we need to insert in leftchild node.
     BinarySearch tree having rule Value less than root node Goes to Left
     Value greated than rootNode goes to right node.
    */
    public void insert(int value){
        //ignoring duplicate value insertion
        if(value == rootNode){
            return;
        }


       //if Value less than root node Goes to Left
        if(value < rootNode){
            if (leftChild == null){
                leftChild = new TreeNode ( value );
            }else {
                leftChild.insert ( value );
            }
        }else {
            if (rightChild == null){
                rightChild = new TreeNode ( value );
            }else {
                rightChild.insert ( value );
            }
        }
    }

    /*
    InOrder traverse means first it will starts with Left Child Node

     */
    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder ();
        }
        System.out.print ( +rootNode +",");
        if (rightChild != null){
            rightChild.traverseInOrder ();
        }
    }

    public TreeNode getElement(int value){
        if (value == rootNode){
            return this;
        }

        if(value < rootNode){
            if (leftChild != null){
                return leftChild.getElement ( value );
            }
        }else {
            if (rightChild != null){
                return rightChild.getElement ( value );
            }
        }
        return null;
    }


    public int min(){
        if (leftChild == null){
            return rootNode;
        }else {
            return leftChild.min ();
        }
    }

    public int max(){
        if (rightChild == null){
            return rootNode;
        }else {
            return rightChild.max ();
        }
    }

    public int getRootNode() {
        return rootNode;
    }

    public void setRootNode(int rootNode) {
        this.rootNode = rootNode;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return Integer.toString ( rootNode );
    }
}
