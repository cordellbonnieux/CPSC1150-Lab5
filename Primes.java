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

        int size = primes.size();
        int remainder = primes.size() % 8;
        int groups = (primes.size() / 8) + (remainder > 0 ? 1 : 0);

        while (groups > 0) {

            int one, two, three, four, five, six, seven, eight;

            for (int x = 0; x <= 8; x++) {

                if (primes.size() > 0) {
                    switch(x) {
                        case 1:
                            one = (int)primes.get(x);
                        case 2:
                            two = (int)primes.get(x);
                        case 3:
                            three = (int)primes.get(x);
                        case 4:
                            four = (int)primes.get(x);
                        case 5:
                            five = (int)primes.get(x);
                        case 6:
                            six = (int)primes.get(x);
                        case 7:
                            seven = (int)primes.get(x);
                        case 8:
                            eight = (int)primes.get(x);
                    }
                    primes.remove(x);
                    x--;
                }

            }

            System.out.printf("%d %d %d %d %d %d %d %d", one, two, three, four, five, six, seven, eight);
        }
    
    
    }
}
