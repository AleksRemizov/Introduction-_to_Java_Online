package com.epam.brest.linear;

import java.util.Scanner;

// Найдите значение функции: z = ((a-3)*b/2) + c
public class FirstTask {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();
        double z = solveLinearFunction(a,b,c);
        System.out.println("Task1.For the values of the variables a = " + a + " , b = " + b +
                " , c = " + c + " ," + "the value of the function z = " + z +".");
    }
    public static double solveLinearFunction(double a, double b, double c){
        return ((a - 3) * b/2) + c;
    }
}
