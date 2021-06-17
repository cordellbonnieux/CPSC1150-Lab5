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

            if (!(i % 2 == 0 || i % 3 == 0 || i % 4 == 0 || i % 5 == 0 || i % 6 == 0 || i % 7 == 0 || i % 8 == 0 || i % 9 == 0))
                primes.add(i);
            else if (i == 2 || i == 3 || i == 5 || i == 7)
                primes.add(i);
        }

        System.out.println("Prime numbers from 2 - 1000 (inclusive):");

        // print out the primes in a nice table
        for (int x = 1; x < primes.size(); x++) {
            if ((primes.size() - x) >= 8) {
                System.out.printf("%d %d %d %d %d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primes.size() - x) == 7) {
                System.out.printf("%d %d %d %d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primes.size() - x) == 6) {
                System.out.printf("%d %d %d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primes.size() - x) == 5) {
                System.out.printf("%d %d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primes.size() - x) == 4) {
                System.out.printf("%d %d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primes.size() - x) == 3) {
                System.out.printf("%d %d %d \n", primes.get(x++), primes.get(x++), primes.get(x++));
            } else if ((primes.size() - x) == 2) {
                System.out.printf("%d %d \n", primes.get(x++), primes.get(x++));
            } else {
                System.out.printf("%d \n", primes.get(x++));
            }
        }
    
    
    }
}
