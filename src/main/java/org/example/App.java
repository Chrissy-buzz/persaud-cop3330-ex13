package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

public class App {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static double calculateCompoundInterest(double principal, double rate, int years, int compound) {
        double r= rate/100;
        double A = principal * Math.pow(1 + (r / compound), compound * years);
        return A;
    }

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        double principal = scan1.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("What is the rate? ");
        double rate = scan2.nextDouble();
        Scanner scan3 = new Scanner(System.in);
        System.out.print("What is the number of years? ");
        int years = scan3.nextInt();
        Scanner scan4 = new Scanner(System.in);
        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = scan4.nextInt();

        double investment;
        investment= calculateCompoundInterest (principal, rate, years, compound);

        System.out.print("$" + principal + " invested at " + rate + "% for " + years + " years, compounded "+ compound +  " times per year is $" + df2.format(investment) + "\n");
    }
}