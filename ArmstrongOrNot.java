// To find Armstrong Number between two given number.
import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        String intToString = Integer.toString(number);
        int startingPoint = 0;

        for(int i = 0; i < intToString.length(); i++){
            // int digit = Character.getNumericValue(intToString.charAt(i));
            // int num = (int) Math.pow(digit, intToString.length());
            int num = (int) Math.pow((intToString.charAt(i) - '0'), intToString.length());
            startingPoint = startingPoint + num;

        }

        if(number == startingPoint){
            System.out.println("The given Number is Armstong Number");
        }
        else{
            System.out.println("The give number is not a Armstrong Number");
        }
    }

}
