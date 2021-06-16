/**
* Class: CPSC 1150
* Assignment: Lab5 - Binary to Decimal
* Description: Reads a binary number as a string from the user, 
*   confirms it is a valid number then converts and prints it back to console.
* Author: Cordell Bonnieux
* Date: June 16th 2021
*/

import java.util.Scanner;
public class B2D {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user
        System.out.print("Enter a binary number: ");

        // read binary
        String binary = input.nextLine();

        // create decimal variable to store conversion
        int decimal = 1;

            // check
            System.out.println("right before the loop");

        // start loop; checks for validity while converting to decimal
        for (int i = binary.length(), e = 1; i > 0; i--, e *= 2) {

                // check
                System.out.println("entered loop");
            
            // is the current index i of binary 0?
            if (binary.charAt((i - 1)) == '0')
                continue;
            
            // is the current index i of binary 1?
            if (binary.charAt((i - 1)) == '1')
                decimal += e;
            // if it's not 1 or 0, reset the program
            else
                //main(args);
                System.out.println("booboo");
        }
        // print the results to the console
        System.out.printf("the binary number %s in decimal is %d.", binary, decimal);

        // end the program
        System.exit(0);


                    // check
                    System.out.println("program should have terminated before this");
    }
}