package com.kavya.artspractice.gfgproblems;

public class ComplexNumber
{
    int real,image;

    public ComplexNumber(int r,int i)
    {
        this.real=r;
        this.image=i;

    }

    public void show()
    {
        System.out.println(this.real+" +i"+this.image);
    }

    public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
    {
        ComplexNumber res = new ComplexNumber(0,0)  ;
        res.real=n1.real+ n2.real;
        res.image=n1.image+ n2.image;
       return res;

    }

    public static void main(String[] args)
    {
        ComplexNumber complexNumber=new ComplexNumber(4,5);
        ComplexNumber complexNumber1=new ComplexNumber(6,5);

        System.out.println("First complex no:");
        complexNumber.show();

        System.out.println("Second complex no:");
        complexNumber1.show();

        ComplexNumber result = add(complexNumber,complexNumber1);

        System.out.println("result");
        result.show();

    }
}
