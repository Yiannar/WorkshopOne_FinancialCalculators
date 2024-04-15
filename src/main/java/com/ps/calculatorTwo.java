package com.ps;

import java.util.Scanner;

public class calculatorTwo {
   public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your deposit amount: ");
       double deposit = scanner.nextInt();

       System.out.println("Enter your interest rate: ");
       double interestRate = scanner.nextFloat();

       System.out.println("Enter term years for account: ");
       int years = scanner.nextInt();

        double dailyInterestRate = interestRate / 100 / 365;
        int numberOfDays = years * 365;

        double futureCdRate = cdFormula( deposit, dailyInterestRate, numberOfDays);
        double totalInterestEarned = futureCdRate - deposit;


       System.out.printf("If you deposit $%.2f in a CD that earns %.2f%% interest and matures in %d years,\n", deposit, interestRate, years);
       System.out.printf("Your CD's ending balance will be $%.2f, and you would have earned $%.2f in interest.\n", futureCdRate, totalInterestEarned);
   }
   public static double cdFormula(double deposit, double dailyInterestRate, int numberOfDays ){
        return deposit * Math.pow(1 + dailyInterestRate , numberOfDays);
   }
}
