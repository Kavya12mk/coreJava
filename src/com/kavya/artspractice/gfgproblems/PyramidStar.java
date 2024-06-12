package com.kavya.artspractice.gfgproblems;

public class PyramidStar
{
    public static void pyramidStar(int number)
    {
        int i,j;
        for (i=0;i<number;i++)
        {
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number=5;
        PyramidStar.pyramidStar(number);
    }
}
