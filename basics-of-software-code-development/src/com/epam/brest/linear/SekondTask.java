package com.epam.brest.linear;

import java.util.Scanner;
//2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (b + sqrt(b^2+4ac)) / (2a) - a^3 * c + b^(-2)
public class SekondTask {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();
        double result = solveLinearFunction(a,b,c);
        System.out.println("Task2.For the values of the variables a = " + a + " , b = " + b +
                " , c = " + c + " ," + "the value of the function  = " + result +".");
    }
    public static double solveLinearFunction(double a, double b, double c){
        return (b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / ( 2 * a) - Math.pow(a,3) * c + Math.pow(b,-2);
    }
}




