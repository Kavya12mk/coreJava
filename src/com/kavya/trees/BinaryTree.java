package com.kavya.trees;

public class BinaryTree
{
    Node root;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root=new Node(12);
        binaryTree.root.left=new Node(6);
        binaryTree.root.right=new Node(18);
        binaryTree.root.left.left = new Node(3);
        System.out.println(binaryTree.root.value);
    }
}
