package com.kavya.programs;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three subjects marks:");
        int marks1 = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();
        int totalMarks = (marks1 + marks2 + marks3);
        int average = totalMarks / 3;
        scanner.close();
        System.out.println("The total marks:" + totalMarks);
        System.out.println("The average is:" + average);

        if (average>=90)
        {
            System.out.println("Grade A");
        }
        else if (average>=80)
        {
            System.out.println("Grade B");
        }
        else if (average>=70)
        {
            System.out.println("Grade C");
        }
        else if (average>=60)
        {
            System.out.println("Grade D");
        }
        else if (average>=50)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}
