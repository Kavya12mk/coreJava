package com.kavya.methods;

public class Main
{
    public static void main(String[] args)
    {
        MainSupport mainSupport=new MainSupport();
        int largestNum = mainSupport.largestNumber(30,20);
        System.out.println("The largest number is:" +largestNum);

        LengthOfString lengthOfString = new LengthOfString();
        int length=lengthOfString.giveLengthOfString("Java Class");
        System.out.println("Length is:"+length);

        CheckNumber checkNumber = new CheckNumber();
        boolean number = checkNumber.checkEvenOrOdd(20);
        System.out.println("The number is :"+number);

        SquareOfNumber squareOfNumber=new SquareOfNumber();
        int square = squareOfNumber.giveSquare(5);
        System.out.println(square);

        Table table = new Table();
        table.giveTables(2);

        Factorial factorial=new Factorial();
        int result=factorial.giveFactorial(5);
        System.out.println("The factorial of number is:"+result);

    }
}
