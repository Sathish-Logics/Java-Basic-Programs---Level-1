// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Hi," + name + ".You can do it, Get Up.");

    }
}