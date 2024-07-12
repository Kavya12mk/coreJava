package com.kavya.traversal;

public class Main
{
    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node((70));

        Traversal traversal=new Traversal();
        System.out.println("Pre OrderTraversal");
        traversal.preOrderTraversal(root);
        System.out.println();

        System.out.println("In Order Traversal");
        traversal.inOrderTraversal(root);
        System.out.println();

        System.out.println("Post Order Traversal");
        traversal.postOrderTraversal(root);
        System.out.println();

        SkewedTree skewedTree=new SkewedTree();
        System.out.println("Left Skewed Tree are:");
        skewedTree.printLeftSkewedTree(root);
        System.out.println();

        System.out.println("Right Skewed Tree are:");
        skewedTree.printRightSkewedTree(root);
        System.out.println();
    }
}
