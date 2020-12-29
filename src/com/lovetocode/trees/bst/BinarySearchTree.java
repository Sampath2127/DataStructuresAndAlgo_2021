package com.lovetocode.trees.bst;

public class BinarySearchTree {
    Node root;

    public void insert( int data ) {
        Node newNode = new Node (data);
        if ( root == null ) root = newNode;
        else {
            Node current = this.root;
            while ( true ) {
                if ( data < current.getData () ) {
                    if ( current.getLeftChild () == null ) {
                        current.setLeftChild (newNode);
                        return;
                    }
                    current = current.getLeftChild ();
                } else {
                    if ( current.getRightChild () == null ) {
                        current.setRightChild (newNode);
                        return;
                    }
                    current = current.getRightChild ();
                }
            }
        }
    }

    public boolean find( int data ) {
        if ( this.root == null ) return false;
        else {
            Node current = root;
            while ( current != null ) {
                if ( data < current.data ) {
                    current = current.leftChild;
                } else if ( data > current.getData () ) {
                    current = current.rightChild;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean remove( int data ) {
        if ( this.root == null ) return false;
        else {
            Node current = this.root;
            Node parent = null;
            while ( current != null ) {
                if ( data < current.data ) {
                    parent = current;
                    current = current.leftChild;
                } else if ( data > current.data ) {
                    parent = current;
                    current = current.rightChild;
                } else if ( data == current.data ) {
                    //found a match
                    //1.) No right child
                    if ( current.rightChild == null ) {
                        if ( parent == null ) {
                            this.root = current.leftChild;
                        } else {
                            if ( parent.data > current.data ) {
                                parent.leftChild = current.leftChild;
                            } else if ( parent.data < current.data ) {
                                parent.rightChild = current.leftChild;
                            }
                        }
                    }
                    //2.) Right child that doesn't have a left child
                    else if ( current.rightChild.leftChild == null ) {
                        if ( parent == null ) {
                            this.root = current.leftChild;
                        } else {
                            current.rightChild.leftChild = current.leftChild;

                            //if Parent > current, make right child left of parent
                            if ( parent.data > current.data ) {
                                parent.leftChild = current.rightChild;
                            } else if ( parent.data < current.data ) {
                                parent.rightChild = current.rightChild;
                            }
                        }
                    }
                    //3.) Right Child that has a left Child
                    else {
                        //find the right child's left most child
                        Node leftMost = current.rightChild.leftChild;
                        Node leftMostParent = current.rightChild;
                        while ( leftMost.leftChild != null ) {
                            leftMostParent = leftMost;
                            leftMost = leftMost.leftChild;
                        }

                        //Parent's left subtree is now leftmost's right subtree
                        leftMostParent.leftChild = leftMost.rightChild;
                        leftMost.leftChild = current.leftChild;
                        leftMost.rightChild = current.rightChild;

                        if ( parent == null ) {
                            this.root = leftMost;
                        } else {
                            if ( parent.data > current.data ) {
                                parent.leftChild = leftMost;
                            } else if ( parent.data < current.data ) {
                                parent.rightChild = leftMost;
                            }
                        }

                    }
                    return true;
                }
            }
        }
        return false;
    }


    public void printInOrder( Node node ) {
        if ( node == null ) return;
        printInOrder (node.leftChild);
        System.out.print (node.data + " ");
        printInOrder (node.rightChild);
    }

    public void printPreOrder( Node node ) {
        if ( node == null ) return;
        System.out.print (node.data + " ");
        printPreOrder (node.leftChild);
        printPreOrder (node.rightChild);
    }

    public void printPostOrder( Node node ) {
        if ( node == null ) return;
        printPreOrder (node.leftChild);
        printPreOrder (node.rightChild);
        System.out.print (node.data + " ");
    }
}
