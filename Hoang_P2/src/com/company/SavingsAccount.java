package com.company;

public class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;


    public SavingsAccount(double v){
        this.savingsBalance = v;
    }

    public void calculateMonthlyInterest(){
        double interest = (this.savingsBalance * annualInterestRate) / 12;
        this.savingsBalance = this.savingsBalance + interest;
        System.out.printf("$%.2f", this.savingsBalance);
        System.out.print("\t\t");
    }

    public static void modifyInterestRate(double rate){
        annualInterestRate = rate;
    }
}
