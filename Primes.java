/**
* Class: CPSC 1150
* Assignment: Lab5 - Primes
* Description: Prints all the prime numbers between 2 - 1000 in a 8 column table
* Author: Cordell Bonnieux
* Date: June 16th 2021
*/

import java.util.ArrayList;
public class Primes {
    public static void main(String[] args) {

        // create array to store primes
        ArrayList<Integer> primes = new ArrayList<Integer>();

        // loop from 2 to 1000 inclusive and check for primes
        for (int i = 1000; i > 1; i--) {
            
            // variable to hold whether current i is composite or prime
            boolean isComposite = false;

            // loop each i to check if composite
            for (int y = 2; y <= i / 2; y++) {
                if (i % y == 0) {
                    isComposite = true;
                    break;
                }
            }

            // if i is not a composite, it is prime; store in primes array
            if (!isComposite)
                primes.add(i);

        }

        // prompt a header for the table
        System.out.println("Prime numbers from 2 - 1000 (inclusive):");

        // store the length of the primes array in a new variable
        int primeCount = primes.size();

        // x counts the number of prime numbers displayed to console in the loop below
        int x = 0;

        // prints prime numbers out in a 8 row table (less rows if there are less values to display)
        while (x < primeCount) {

            if ((primeCount - x) >= 8) {
                System.out.printf("%d %d %d %d %d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primeCount - x) == 7) {
                System.out.printf("%d %d %d %d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primeCount - x) == 6) {
                System.out.printf("%d %d %d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primeCount - x) == 5) {
                System.out.printf("%d %d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primeCount - x) == 4) {
                System.out.printf("%d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primeCount - x) == 3) {
                System.out.printf("%d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primeCount - x) == 2) {
                System.out.printf("%d %d \n", primes.get(x++), primes.get(x++));
            } else {
                System.out.printf("%d \n", primes.get(x++));
            }
        }
    }
}
