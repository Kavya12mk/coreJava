package com.kavya.leafnodes;

public class SumOfNodes
{
    public int printTotalSum(Node node)
    {
        if(node==null)
            return 0;
        else
            return node.value+printTotalSum(node.left)+printTotalSum(node.right);
    }
}
