package com.company;

<<<<<<< HEAD
import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    static double answers;
    static int random1;
    static int random2;
    static int increment = 1;
    static double correct = 0.0;
    static int difficulty;
    static int type;

    public static int responses() // asks difficulty and type of problem student wants
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What difficulty would you like? Enter 1,2,3, or 4.");
        difficulty = scnr.nextInt();
        System.out.println("What type of problem would you like to work on? Enter 1,2,3,4, or 5.");
        type = scnr.nextInt();
        return 0;
    }

    public static int question() {
        // create instance of SecureRandom class
        SecureRandom rand = new SecureRandom();
        double rand_int1;
        double rand_int2;

        random1 = rand.nextInt(4) + 1;
        random2 = rand.nextInt(4) + 1;

        if (difficulty == 1) {
            rand_int1 = rand.nextInt(10) + 1;
            rand_int2 = rand.nextInt(10) + 1;
        } else if (difficulty == 2) {
            rand_int1 = rand.nextInt(90) + 10;
            rand_int2 = rand.nextInt(90) + 10;
        } else if (difficulty == 3) {
            rand_int1 = rand.nextInt(900) + 100;
            rand_int2 = rand.nextInt(900) + 100;
        } else if (difficulty == 4) {
            rand_int1 = rand.nextInt(9000) + 1000;
            rand_int2 = rand.nextInt(9000) + 1000;
        } else {
            return 0;
        }

        if (type == 1) {
            System.out.println("Question #" + increment + ": How much is " + rand_int1 + " plus " + rand_int2 + "?");
            answers = rand_int1 + rand_int2;
        } else if (type == 2) {
            System.out.println("Question #" + increment + ": How much is " + rand_int1 + " times " + rand_int2 + "?");
            answers = rand_int1 * rand_int2;
        } else if (type == 3) {
            System.out.println("Question #" + increment + ": How much is " + rand_int1 + " minus " + rand_int2 + "?");
            answers = rand_int1 - rand_int2;
        } else if (type == 4) {
            System.out.println("Question #" + increment + ": How much is " + rand_int1 + " divided " + rand_int2 + "?");
            answers = rand_int1 / rand_int2;
        } else if (type == 5) {
            type = rand.nextInt(4) + 1;
            if (type == 1) {
                System.out.println("Question #" + increment + ": How much is " + rand_int1 + " plus " + rand_int2 + "?");
                answers = rand_int1 + rand_int2;
            } else if (type == 2) {
                System.out.println("Question #" + increment + ": How much is " + rand_int1 + " times " + rand_int2 + "?");
                answers = rand_int1 * rand_int2;
            } else if (type == 3) {
                System.out.println("Question #" + increment + ": How much is " + rand_int1 + " minus " + rand_int2 + "?");
                answers = rand_int1 - rand_int2;
            } else if (type == 4) {
                System.out.println("Question #" + increment + ": How much is " + rand_int1 + " divided " + rand_int2 + "?");
                answers = rand_int1 / rand_int2;
            }
            type = 5;
        }
        return 0;
    }

    public static int answer() {

        Scanner scnr = new Scanner(System.in);  // Create a Scanner object
        double userAnswer = scnr.nextDouble();

        if (userAnswer == answers) {
            switch (random1) {
                case 1:
                    System.out.println("Very good!");
                    correct++;
                    break;
                case 2:
                    System.out.println("Excellent!");
                    correct++;
                    break;
                case 3:
                    System.out.println("Nice work!");
                    correct++;
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    correct++;
                    break;
            }
        } else {
            switch (random2) {
                case 1:
                    System.out.println("No. Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don’t give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying.");
                    break;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        char ask;
        int tracker = 0;
        Scanner scnr = new Scanner(System.in);
        responses();
        while (increment <= 10) {
            question();
            answer();
            increment++;
            tracker++;

            if (tracker == 10) {
                if (correct < 7.5) {
                    System.out.println("You got " + correct + "" + " question(s) correct and " + (10.0 - correct) + " incorrect.");
                    System.out.println("Please ask your teacher for extra help.");
                } else if (correct < 10.0) {
                    System.out.println("You got " + correct + "" + " questions correct and " + (10.0 - correct) + " incorrect.");
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }


                System.out.println("Would you like to do another session? Type in either y or Y.");
                ask = scnr.next().charAt(0);
                if (ask == 'y' || ask == 'Y') {
                    increment = 1;
                    tracker = 0;
                    correct = 0;
                    responses();
                } else {
                    break;
                }
            }
        }

    }
}

=======
public class Main {


    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Month \t\t saver1 \t\t saver2");
        for(int i = 0; i < 12; i++) {
            System.out.print(i + 1 + "\t\t\t");
            saver1.calculateMonthlyInterest();
            System.out.print("\t\t");
            saver2.calculateMonthlyInterest();
            System.out.println("");

        }
        System.out.println("Interest now 5%.");
        SavingsAccount.modifyInterestRate(0.05);
        System.out.print("\t\t\t");
        saver1.calculateMonthlyInterest();
        System.out.print("\t\t");
        saver2.calculateMonthlyInterest();
        System.out.println("");

    }
}
>>>>>>> first commit
