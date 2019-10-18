package com.company;

public class Main {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Month \t\t saver1 \t\t saver2");

        for(int i = 0; i < 12; ++i){
            System.out.print(i + 1 + "\t\t\t");
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("\t\t\t");
            System.out.println();
        }
        System.out.println("New rate now 5%.");
        System.out.println();
        SavingsAccount.modifyInterestRate(0.05);
        System.out.print("\t\t\t");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

    }
}
