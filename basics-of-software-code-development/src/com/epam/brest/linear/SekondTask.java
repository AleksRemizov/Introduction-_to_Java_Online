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

        if (a!=0 && b!=0 && (Math.pow(b,2) + 4 * a * c)>0 ) {
            System.out.printf("Task2.For the values of the variables a = %f, b = %f, c = %f " +
                    "the value of the function  = %.2f .", a,b,c, solveLinearFunction(a, b, c));
        }else {
            System.out.println("These  values are incorrect.Try again.");
            }
    }
    public static double solveLinearFunction(double a, double b, double c){
        return (b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / ( 2 * a) - Math.pow(a,3) * c + Math.pow(b,-2);
    }1
}




