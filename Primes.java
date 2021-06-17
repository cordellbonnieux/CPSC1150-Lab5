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
        for (int i = 2; i <= 1000; i++) {

            // if number is not prime continue
            if (i < 10 && (i != 2 || ))
            else if (i % 2 == 0 || i % 3 == 0 || i % 4 == 0 || i % 5 == 0 || i % 6 == 0 || i % 7 == 0 || i % 8 == 0 || i % 9 == 0) 
                continue;
            // if number is prime, add to primes
            else
                primes.add(i);
        }

        for (int x = primes.size() - 1; x > 0; x--)
            System.out.print(primes(x) + " ");
    
    }
}
