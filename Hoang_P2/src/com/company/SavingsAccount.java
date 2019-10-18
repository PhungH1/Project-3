package com.company;

public class SavingsAccount {
    public static double annualInterestRate = 0.0;
    private  double savingsBalance;

    public SavingsAccount(double v) {
        this.savingsBalance = v;
    }


    public void calculateMonthlyInterest()
    {
        double monthlyInterest = (this.savingsBalance * annualInterestRate) / 12;
        this.savingsBalance = this.savingsBalance + monthlyInterest;
        System.out.printf("$%.2f" ,this.savingsBalance);
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }
}
