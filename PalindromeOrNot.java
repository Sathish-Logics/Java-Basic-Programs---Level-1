// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String givenWords = input.next();

        String emptyString = "";

        for(int i = givenWords.length() - 1; i >= 0; i--){
            emptyString = emptyString + givenWords.charAt(i);
        }
        System.out.println(emptyString);

        if(givenWords.equals(emptyString)){
            System.out.println("The given word is Palindrome");
        }
        else{
            System.out.println("The given word is not a Palindrome");
        }

    }
}
