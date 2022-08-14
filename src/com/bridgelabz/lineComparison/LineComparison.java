package com.bridgelabz.lineComparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation program");
        calculateLength();
    }
    public static void calculateLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of first point x1 y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter coordinates of second point x2 y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length1 = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        System.out.printf("length of first line is = %.2f ",length1);

        System.out.println("Enter points of second line : ");
        System.out.println("Enter coordinates of first point a1 b1 : ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Enter coordinates of second point a2 b2 : ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        double length2 = (Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1)));
        System.out.printf("length of second line is = %.2f \n ", length2);

        checkLineEquality(length1 , length2);
    }

    static void checkLineEquality(Double length1, Double length2) {
        boolean x = (length1.equals(length2));
        if (x)
        {
            System.out.println("Length of two lines are equal");
        }
        else
        {
            System.out.println("Length of two lines are not equal");
        }
    }
}
