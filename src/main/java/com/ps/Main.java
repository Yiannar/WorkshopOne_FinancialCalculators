package com.ps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Enter your interest: ");
        float interest = scanner.nextFloat();

        System.out.print("Enter your mortgage term: ");
        float mortgageTerm = scanner.nextFloat();

        float monthlyInterestRate = interest / 100 / 12;
        float numberOfMonthlyPayments = mortgageTerm * 12;

        float mortgage = mortgageFormula(principal, monthlyInterestRate, numberOfMonthlyPayments);
        System.out.printf("Your monthly mortgage payment is: %.2f", mortgage);
    }

    public static float mortgageFormula(int principal, float monthlyInterestRate, float numberOfMonthlyPayments) {
        return principal * monthlyInterestRate * (float) Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments)
                / ((float) Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments) - 1);
    }
}
