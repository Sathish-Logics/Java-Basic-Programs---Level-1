// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: " );
        double firstNumber = input.nextDouble();

        System.out.print("Enter the Second Number: " );
        double secondNumber = input.nextDouble();


        if(firstNumber != secondNumber){
            if(firstNumber > secondNumber){
                System.out.println("First Number is Greater than Second Number");
            }
            else{
                System.out.println("Second Number is Greater than First Number");
            }
        }
        else{
            System.out.println("Both are same Number");
        }
    }
}
