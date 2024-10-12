// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Principal Amount");
        int principalAmount = input.nextInt();

        System.out.println("Enter the Interest Rate");
        double interestRate = input.nextDouble();

        System.out.println("Enter the Year Tender");
        int yearTender = input.nextInt();

        double simpleInterest = (principalAmount * interestRate * yearTender)/100;
        System.out.println(simpleInterest);

    }

}
