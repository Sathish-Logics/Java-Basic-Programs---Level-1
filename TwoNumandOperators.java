// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class TwoNumandOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the First Number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the Second Number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Enter the Operator(+, -, *, /): ");
        String operator = input.next();

        if(operator.equals("+")){
            double addition = firstNumber + secondNumber;
            System.out.println("Addition of given Two Numbers: " + addition);
        }
        else if(operator.equals("-")){
            double subtraction = firstNumber - secondNumber;
            System.out.println("Subtraction of given Two Numbers: " + subtraction);
        }
        else if (operator.equals("*")){
            double multiply = firstNumber * secondNumber;
            System.out.println("Multiply of given Two Numbers: " + multiply);
        }
        else if(operator.equals("/")){
            if(secondNumber != 0){
                double division = firstNumber / secondNumber;
                System.out.println("Division of given Two Numbers: " + division);
            }
            else{
                System.out.println("Cannot divide by Zero");
            }
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}