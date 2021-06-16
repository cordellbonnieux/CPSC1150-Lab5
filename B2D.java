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
        int decimal = 0;

        // start loop; checks for validity while converting to decimal
        for (int i = binary.length(), e = 1; i > 0; i--, e *= 2) {
            
            // is the current index i of binary 1?    
            if (binary.charAt((i - 1)) == '1') {
                decimal += e;

            // if not check if the current index i of binary NOT 0?
            } else if (binary.charAt((i - 1)) != '0') {

                // if so restart the program
                System.out.println(binary + " is not a valid binary number.");
                main(args);
            }
        }

        // print the results to the console
        System.out.printf("the binary number %s in decimal notation is %d. \n", binary, decimal);

        // end the program
        System.exit(0);
    }
}