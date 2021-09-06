package exercise02;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the input string? ");

        String input = userInput.next();

        System.out.print(input +" has " +input.length() +" characters.\n");
    }
}
