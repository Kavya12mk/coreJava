package com.kavya.counttotalnodes;

public class Main
{
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        CountNodes countNodesObject = new CountNodes();
        System.out.println("Total number of nodes:"+countNodesObject.countNodes(root));
    }
}
