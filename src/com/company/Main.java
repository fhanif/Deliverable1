package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // prompt message
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        //declaring all variables
        int userNum = scnr.nextInt();
        String userNumString = "";
        int userNumLength = 0;
        int i = 0;
        char indivDigit = '?';
        int indivDigitInt = 0;
        int indivDigitCubed = 0;
        int digitCubedTotal = 0;

        //converting integer value to a string
        userNumString = String.valueOf(userNum);
        //finding length of string of the integer entered (for the loop)
        userNumLength = userNumString.length();

        //for loop, from first character (i = 0) to last character (length - 1)
        for (i = 0; i <= userNumLength - 1; ++i) {
            //separating the individual digits in the number entered (type char)
            indivDigit = userNumString.charAt(i);
            //converting individual digit (character) to an integer -- not sure about yellow highlight here????????)
            indivDigitInt = Integer.parseInt(userNumString.valueOf(indivDigit));
            //calculating the cubes of the individual digits in number entered
            indivDigitCubed = indivDigitInt * indivDigitInt * indivDigitInt;
            //calculating total sum of all digits cubed in the number entered
            digitCubedTotal += indivDigitCubed;
        }

        //if statement to print true if total sum of cubes is equal to number entered
        // how could have done this with a boolean???????
        if (digitCubedTotal == userNum) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }
}
//- Write the task in a separate method. - I DON'T THINK I DID THIS???


/* Input: Your program should read an integer number from the user.

Task: For the input integer number, find if the sum of the cubes of the number’s digits is equal to the number itself.

Output: Your program should print out: True or False based on the result.

Examples:
153: 13 + 53 + 33  = 153  Program prints True.
243: 23 + 43 + 33 = 99  Program prints False.
Things to look for:
- Do proper validation on the user’s input.
- Write the task in a separate method.
- Provide adequate comments.
- Provide adequate user prompts.
*/


