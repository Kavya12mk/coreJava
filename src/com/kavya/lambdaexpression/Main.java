package com.kavya.lambdaexpression;

import java.util.function.*;

public class Main
{
    public static void main(String[] args)
    {
        BiConsumer consumer = (a,b)->{
            System.out.println("The value of a is:"+a+"\nThe value of b is:"+b);
        };
        consumer.accept(10,5);

        BiFunction biFunction = (a,b)->{
            return a+"\njava is going good\n"+b;
        };
        System.out.println(biFunction.apply("Hello,","Thanks"));

        Consumer consumer1 = (a)->{
            System.out.println("Keep Practising "+a);
        };
        consumer1.accept("Kavya");

        Predicate predicate = (a)->{
            if(a.equals("Pass"))
                return true;
            else
                return false;
        };
        System.out.println(predicate.test("Pass"));

        Supplier supplier = ()->{
            return "Successfully Passed";
        };
        System.out.println(supplier.get());
    }
}
