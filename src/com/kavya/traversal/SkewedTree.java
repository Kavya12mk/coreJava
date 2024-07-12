package com.kavya.traversal;

public class SkewedTree
{
    public void printLeftSkewedTree(Node node)
    {
        if(node==null)
            return;
        if (node.left!=null || node!=null)
            System.out.print(node.value+" ");
            printLeftSkewedTree(node.left);
    }

    public void printRightSkewedTree(Node node)
    {
        if(node==null)
            return;
        if (node.right!=null || node!=null)
            System.out.print(node.value+" ");
            printRightSkewedTree(node.right);
    }
}
