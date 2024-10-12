// Input currency in rupees and output in USD.

import java.util.Scanner;

public class RsToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a rupees: ");
        double rupees = input.nextDouble();

        double rsToUsd = rupees * 0.012; // 2024-12-10, Current conversion rate
        
        System.out.println(rupees + " is equal to " + rsToUsd);        
        
    }
}