package com.ds.tree.binarysearctree;

public class BinarySearchTree {

    private TreeNode rootNode;

    public void insert(int value){
        if (rootNode == null){
            rootNode = new TreeNode ( value );
        }else {
            rootNode.insert ( value );
        }
    }

    public void traverseInOrder(){
        if(rootNode !=  null) {
            rootNode.traverseInOrder ();
        }
    }

    public TreeNode get(int value){
        if (rootNode != null){
            return rootNode.getElement ( value );
        }

        return null;
    }

    public Integer getMinValue(){
        if (rootNode != null){
            return rootNode.min ();
        }
        return null;
    }

    public Integer getMaxValue(){
        if (rootNode != null){
            return rootNode.max ();
        }
        return null;
    }

}
