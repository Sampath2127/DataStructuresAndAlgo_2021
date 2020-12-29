package com.lovetocode.trees.bst;


public class Node {

    Node leftChild;
    Node rightChild;
    int data;

    public Node( int data ) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild( Node rightChild ) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData( int data ) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild( Node leftChild ) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
