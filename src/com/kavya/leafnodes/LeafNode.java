package com.kavya.leafnodes;

public class LeafNode
{
    public void printLeafNodes(Node node)
    {
        //base condition
        if(node==null)
            return;

        //logic
        if(node.left==null&&node.right==null)
        {
            System.out.print(node.value+" ");
            return;
        }

        //recursive case
        if(node.left!=null)
            printLeafNodes(node.left);

        if (node.right!=null)
            printLeafNodes(node.right);
    }
}
