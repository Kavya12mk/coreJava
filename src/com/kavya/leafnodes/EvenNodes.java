package com.kavya.leafnodes;

public class EvenNodes
{
    public void printEvenNodes(Node node)
    {
        if(node==null)
            return;

        if(node.value%2==0)
            System.out.print(node.value+" ");

        if(node.left!=null)
            printEvenNodes(node.left);

        if (node.right!=null)
            printEvenNodes(node.right);
    }

}
