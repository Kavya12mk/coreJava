package com.kavya.leafnodes;

public class Main
{
    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(2);

        System.out.println("Leaf Nodes are:");
        LeafNode leafNode=new LeafNode();
        leafNode.printLeafNodes(root);
        System.out.println();

        System.out.println("Even nodes are:");
        EvenNodes evenNodes = new EvenNodes();
        evenNodes.printEvenNodes(root);
        System.out.println();

        System.out.println("Total sum of nodes are:");
        SumOfNodes sumOfNodes=new SumOfNodes();
        System.out.println(sumOfNodes.printTotalSum(root));


    }
}
